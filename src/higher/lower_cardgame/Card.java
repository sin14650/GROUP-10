// Card.java
package higher.lower_cardgame;

public class Card {
    private final suit suit;
    private final Rank rank;

    public Card(suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
