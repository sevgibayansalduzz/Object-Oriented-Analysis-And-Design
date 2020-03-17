package part4.AbstractFactory;

public class DomesticFactory extends ProductionFactory {
    /**
     * Creates instance for given type.
     * @param type String
     * @return TPX
     */
    @Override
    protected TPX createPlane(String type) {
        AerostructureFactory aerostructureFactory=new DomesticAerostructureFactory();
        if(type.equals("100"))
            return new TPX100(new DomesticAerostructureFactory());
        else if(type.equals("200"))
            return new TPX200(new DomesticAerostructureFactory());
        else if(type.equals("300"))
            return new TPX300(new DomesticAerostructureFactory());
        else
            return null;
    }
}
