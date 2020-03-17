package part3;

public class RocketLauncher extends Accessories {
    /**
     * An instance variable to hold the suit we are wrapping
     */
    Suit suit;

    /**
     *  Constructor sets the instance variable to the object which is wrapping.
     * @param suit Suit
     */
    public RocketLauncher(Suit suit) {
        this.suit = suit;
    }

    /**
     * Return the cost of RockectLauncher and the Suit
     * @return double
     */
    @Override
    public double cost() {
        return 150+suit.cost();
    }

    /**
     * Return the weight of RockectLauncher and the Suit
     * @return double
     */
    @Override
    public double kg() {
        return 7.5+suit.kg();
    }

    /**
     * Return the description of RockectLauncher and the Suit
     * @return String
     */
    @Override
    public String getDescription() {
        return suit.getDescription()+", RocketLauncher";
    }
}
