package part3;

public class Tor extends Suit {
    /**
     * Tor constructor. Assigns "Tor" to description data field.
     */
    public Tor(){
        description="Tor";
    }

    /**
     * Return cost of the Tor suit.
     * @return double
     */
    @Override
    public double cost() {
        return 5000;
    }

    /**
     * Returns weight of the Tor suit.
     * @return double
     */
    @Override
    public double kg() {

        return 50;
    }
}
