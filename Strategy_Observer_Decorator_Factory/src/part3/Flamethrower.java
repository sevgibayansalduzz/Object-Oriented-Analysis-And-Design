package part3;

public class Flamethrower extends Accessories {
    /**
     * An instance variable to hold the suit we are wrapping
     */
    Suit suit;

    /**
     *  Constructor sets the instance variable to the object which is wrapping.
     * @param suit Suit
     */
    public Flamethrower(Suit suit) {
        this.suit = suit;
    }

    /**
     * Return the cost of Flamethrower and the Suit
     * @return double
     */
    @Override
    public double cost() {
        return 50+suit.cost();
    }

    /**
     * Return the weight of Flamethrower and the Suit
     * @return double
     */
    @Override
    public double kg() {
        return 2+suit.kg();
    }

    /**
     * Return the description of Flamethrower and the Suit
     * @return String
     */
    @Override
    public String getDescription() {
        return suit.getDescription()+", Flamethrower";
    }
}
