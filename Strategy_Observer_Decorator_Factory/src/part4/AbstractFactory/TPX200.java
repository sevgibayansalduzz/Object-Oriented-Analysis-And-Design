package part4.AbstractFactory;

public class TPX200 extends TPX {
    /**
     * Default constructor sets propeties of TPX200 plane. Sets engine and covertype with the aerostructureFactory
     */
    public TPX200(AerostructureFactory aerostructureFactory) {
        name="TPX200";
        engine=aerostructureFactory.createEngine();
        seatingsize=100;
        covertype=aerostructureFactory.createSeatingCover();
        purpose="Domestic and short international flights";
        skeleton="Nickel alloy";
    }
}
