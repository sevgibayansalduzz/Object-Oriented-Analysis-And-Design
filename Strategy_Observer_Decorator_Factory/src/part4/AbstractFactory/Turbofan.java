package part4.AbstractFactory;

public class Turbofan implements Engine {
    /**
     * Holds the name of the engine.
     */
    String name;
    /**
     * Assign "Turbofan" to the name data field.
     */
    public Turbofan() {
        this.name="Turbofan";
    }

    /**
     * Returns the name of the engine
     * @return String
     */
    @Override
    public String getName() {
        return name;
    }
}
