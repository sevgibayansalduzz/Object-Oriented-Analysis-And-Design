package part4.Factory;

public class ConcreteFactory extends ProductionFactory {
    /**
     * Creates instance for given type.
     * @param type String
     * @return TPX
     */
    @Override
    protected TPX createPlane(String type) {
        if(type.equals("100"))
            return new TPX100();
        else if(type.equals("200"))
            return new TPX200();
        else if(type.equals("300"))
            return new TPX300();
        else
            return null;
    }
}
