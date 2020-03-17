package part3;

public class Dec extends Suit {

    public Dec() {
        description="Dec";
    }

    /**
     * Return cost of the Dec suit.
     * @return double
     */
    @Override
    public double cost() {
        return 500;
    }

    /**
     * Return weigth of the Dec suit.
     * @return double
     */
    @Override
    public double kg() {
        return 25;
    }
}
