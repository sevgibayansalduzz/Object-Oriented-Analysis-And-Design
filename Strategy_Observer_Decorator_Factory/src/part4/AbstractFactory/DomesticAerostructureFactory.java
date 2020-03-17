package part4.AbstractFactory;

public class DomesticAerostructureFactory implements AerostructureFactory {
    /**
     * Creates TurboJet Engine
     * @return Engine
     */
    @Override
    public Engine createEngine() {
        return new TurboJet();
    }

    /**
     * Creates Velvet Engine
     * @return Engine
     */
    @Override
    public SeatingCover createSeatingCover() {
        return new Velvet();
    }
}
