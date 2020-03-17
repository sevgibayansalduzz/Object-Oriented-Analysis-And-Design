package part4.AbstractFactory;

public class TPX300 extends TPX {

    /**
     * Default constructor sets propeties of TPX300 plane. Sets engine and covertype with the aerostructureFactory
     */
    public TPX300(AerostructureFactory aerostructureFactory) {
        name="TPX300";
        purpose="Transatlantic flights";
        seatingsize=250;
        covertype=aerostructureFactory.createSeatingCover();
        skeleton="Titanium alloy";
        engine=aerostructureFactory.createEngine();
    }
}
