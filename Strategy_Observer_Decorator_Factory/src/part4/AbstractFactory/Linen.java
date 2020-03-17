package part4.AbstractFactory;

public class Linen implements SeatingCover {
    /**
     * Holds the type of the seating cover.
     */
    String name;
    /**
     * Assign "Linen" to the type of the seating cover.
     */
    public Linen() {
        this.name="Linen";
    }

    /**
     * Returns the type of the seating cover
     * @return String
     */
    @Override
    public String getName() {
        return name;
    }
}
