package part4.AbstractFactory;

public class Leather implements SeatingCover {
    /**
     * Holds the type of the seating cover.
     */
    String name;
    /**
     * Assign "Leather" to the type of the seating cover.
     */
    public Leather() {
        this.name="Leather";
    }

    /**
     * Returns the type of the seating cover
     * @return String
     */
    @Override
    public String getName() {
        return name;
    }}
