package cardgameweek4;

/**
 * Starter code for the Card class. To be used in Week 4.
 *
 * @author Fuwad, 2023
// * @modified Fuwad Oladega Jan 2023
 */
public class UnoCard {

    public enum Suit { RED,YELLOW,GREEN,BLUE}

    public enum Value {
       ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NinE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD
    }
    
    private final Suit suit;
    private final Value value;

    public UnoCard(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
