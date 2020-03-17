package part4.AbstractFactory;

public class GearedTurbofan implements Engine {
    /**
     * Holds the name of the engine.
     */
    String name;

    /**
     * Assign "Geared Turbofan" to the name data field.
     */
    public GearedTurbofan() {
        this.name="Geared Turbofan";
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
