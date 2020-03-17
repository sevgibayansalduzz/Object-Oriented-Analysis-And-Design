package part4.AbstractFactory;

public class TPX100 extends TPX {

    /**
     * Default constructor sets propeties of TPX100 plane. Sets engine and covertype with the aerostructureFactory
     */
    public TPX100(AerostructureFactory aerostructureFactory) {
        name="TPX100";
        engine=aerostructureFactory.createEngine();
        seatingsize=50;
        covertype=aerostructureFactory.createSeatingCover();
        skeleton="Aluminum alloy";
        purpose="Domestic flights";

    }
}
