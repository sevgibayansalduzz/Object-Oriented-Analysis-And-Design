package part3;

public class AutoRifle extends Accessories {

    /**
     * An instance variable to hold the suit we are wrapping
     */
    Suit suit;

    /**
     *  Constructor sets the instance variable to the object which is wrapping.
     * @param suit Suit
     */
    public AutoRifle(Suit suit) {
        this.suit = suit;
    }

    /**
     * Return the cost of AutoRifle and the Suit
     * @return double
     */
    @Override
    public double cost() {
        return 30+suit.cost();
    }

    /**
     * Return the weight of AutoRifle and the Suit
     * @return double
     */
    @Override
    public double kg() {
        return 1.5+suit.kg();
    }

    /**
     * Return the description of AutoRifle and the Suit
     * @return String
     */
    @Override
    public String getDescription() {
        return suit.getDescription()+", AutoRifle";
    }
}
