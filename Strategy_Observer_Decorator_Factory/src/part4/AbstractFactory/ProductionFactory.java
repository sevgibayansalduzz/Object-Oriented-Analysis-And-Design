package part4.AbstractFactory;

public abstract class ProductionFactory {

    /**
     * Takes a string for type of plane. Then creates plane according to type.
     * @param type
     * @return
     */
    public TPX orderPlane(String type){
        TPX plane;
        plane= createPlane(type);
        if(plane==null){
            System.out.println("Cannot find plane for given type.");
            return null;
        }
        plane.constructSkeleton();
        plane.placeEngines();
        plane.placeSeats();
        return plane;
    }
    /**
     * Creates plane according to type.
     * @param type
     * @return
     */
    protected abstract TPX createPlane(String type);
}


