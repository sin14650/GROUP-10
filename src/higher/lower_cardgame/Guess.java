
package higher.lower_cardgame;

public class Guess {
    public static boolean isCorrectGuess(String guess, Card currentCard, Card nextCard) {
        return (guess.equals("h") && nextCard.getValue() > currentCard.getValue()) ||
               (guess.equals("l") && nextCard.getValue() < currentCard.getValue());
    }
}
