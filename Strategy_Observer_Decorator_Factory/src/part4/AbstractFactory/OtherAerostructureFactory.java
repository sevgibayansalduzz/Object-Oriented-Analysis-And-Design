package part4.AbstractFactory;

public class OtherAerostructureFactory implements AerostructureFactory {
    /**
     * Creates GearedTurbofan Engine
     * @return Engine
     */
    @Override
    public Engine createEngine() {
        return new GearedTurbofan();
    }

    /**
     * Creates Leather SeatingCover
     * @return Engine
     */
    @Override
    public SeatingCover createSeatingCover() {
        return new Leather();
    }
}
