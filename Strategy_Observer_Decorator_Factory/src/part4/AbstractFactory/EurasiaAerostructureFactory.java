package part4.AbstractFactory;

public class EurasiaAerostructureFactory implements AerostructureFactory {
    /**
     * Creates Turbofan Engine
     * @return Engine
     */
    @Override
    public Engine createEngine() {
        return new Turbofan();
    }

    /**
     * Creates Linen SeatingCover
     * @return Engine
     */
    @Override
    public SeatingCover createSeatingCover() {
        return new Linen();
    }
}
