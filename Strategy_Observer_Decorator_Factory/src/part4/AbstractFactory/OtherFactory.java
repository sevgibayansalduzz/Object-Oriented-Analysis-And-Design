package part4.AbstractFactory;

public class OtherFactory extends ProductionFactory {

    /**
     * Creates instance for given type.
     * @param type String
     * @return TPX
     */
    @Override
    protected TPX createPlane(String type) {
        if(type.equals("100"))
            return new TPX100(new OtherAerostructureFactory());
        else if(type.equals("200"))
            return new TPX200(new OtherAerostructureFactory());
        else if(type.equals("300"))
            return new TPX300(new OtherAerostructureFactory());
        else
            return null;
    }
}
