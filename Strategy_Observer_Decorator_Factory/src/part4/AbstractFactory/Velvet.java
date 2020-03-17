package part4.AbstractFactory;

public class Velvet implements SeatingCover {
    /**
     * Holds the type of the seating cover.
     */
    String name;
    /**
     * Assign "Velvet" to the type of the seating cover.
     */
    public Velvet() {
        this.name="Velvet";
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
