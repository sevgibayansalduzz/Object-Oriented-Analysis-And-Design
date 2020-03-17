package part4.AbstractFactory;


public interface AerostructureFactory {
    /**
     * Creates Engine
     * @return Engine
     */
    public Engine createEngine();

    /**
     * Creates seating cover
     * @return Seating Cover
     */
    public SeatingCover createSeatingCover();
}
