package part4.AbstractFactory;

public class TurboJet implements Engine {
    /**
     * Holds the name of the engine.
     */
    String name;
    /**
     * Assign "TurboJet" to the name data field.
     */
    public TurboJet() {
        this.name="TurboJet";
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
