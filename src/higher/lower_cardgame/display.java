// Display.java
package higher.lower_cardgame;

public class display {
    public static void displayFirstCard(Card card) {
        System.out.println("The first card is: " + card);
    }

    public static void displayNextCard(Card card) {
        System.out.println("The next card is: " + card);
    }

    public static void displayScore(Player player) {
        System.out.println(player.getName() + " current score: " + player.getScore());
    }

    public static void displayFinalScore(Player player) {
        System.out.println(player.getName() + " final score: " + player.getScore());
    }

    public static void displayGuessPrompt() {
        System.out.print("Will the next card be (h)igher or (l)ower? ");
    }

    public static void displayWinMessage() {
        System.out.println("Correct! You win!");
    }

    public static void displayGameOverMessage() {
        System.out.println("Incorrect! Game over.");
    }
}
