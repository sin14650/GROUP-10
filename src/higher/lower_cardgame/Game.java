// Game.java
package higher.lower_cardgame;

import java.util.Scanner;

public class Game {
    private final Player player;
    private final Deck deck;

    public Game(Player player) {
        this.player = player;
        this.deck = new Deck();
        this.deck.shuffle();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Card currentCard = deck.drawCard();
        display.displayFirstCard(currentCard);

        while (true) {
            display.displayGuessPrompt();
            String guess = scanner.nextLine().trim().toLowerCase();

            Card nextCard = deck.drawCard();
            display.displayNextCard(nextCard);

            if (Guess.isCorrectGuess(guess, currentCard, nextCard)) {
                display.displayWinMessage();
                player.incrementScore(1);
            } else {
                display.displayGameOverMessage();
                break;
            }

            currentCard = nextCard;
            display.displayScore(player);
        }

        display.displayFinalScore(player);
        scanner.close();
    }
}
