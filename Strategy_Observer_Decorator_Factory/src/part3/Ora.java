package part3;

public class Ora extends Suit {
    /**
     * Tor constructor. Assigns "Ora" to description data field.
     */
    public Ora() {
        description="Ora";
    }

    /**
     * Return cost of the Ora suit.
     * @return double
     */
    @Override
    public double cost() {
        return 1500;
    }

    /**
     * Return weight of the Ora suit.
     * @return double
     */
    @Override
    public double kg() {
        return 30;
    }
}
