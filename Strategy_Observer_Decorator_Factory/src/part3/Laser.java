package part3;

public class Laser extends Accessories {
    /**
     * An instance variable to hold the suit we are wrapping
     */
    Suit suit;

    /**
     *  Constructor sets the instance variable to the object which is wrapping.
     * @param suit Suit
     */
    public Laser(Suit suit) {
        this.suit = suit;
    }

    /**
     * Return the cost of Laser and the Suit
     * @return double
     */
    @Override
    public double cost() {
        return 200+suit.cost();
    }

    /**
     * Return the weight of Laser and the Suit
     * @return double
     */
    @Override
    public double kg() {
        return 5.5+suit.kg();
    }

    /**
     * Return the description of Laser and the Suit
     * @return String
     */
    @Override
    public String getDescription() {
        return suit.getDescription()+", Laser";
    }
}
