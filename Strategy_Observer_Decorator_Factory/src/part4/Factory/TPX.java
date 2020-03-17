package part4.Factory;

public abstract class TPX {
    /**
     * This data field holds the name of the plane
     */
    String name;
    /**
     *This data field holds the pupose of the plane
     */
    String purpose;
    /**
     * This data field holds the type of skeleton of the plane
     */
    String skeleton;
    /**
     * This data field holds the type of engine of the plane
     */
    String engine;
    /**
     * This data field holds the number of seating
     */
    int seating;
    /**
     * This methods constructs the skeleton
     */
    void constructSkeleton(){
        System.out.println("Constructing "+skeleton+" skeleton.");
    }
    /**
     * this method places the engines
     */
    void placeEngines(){
        System.out.println("Placing "+engine+".");
    }
    /**
     * this method places the seats
     */
    void placeSeats(){
        System.out.println("Placing "+seating+" seats.");
    }
    /**
     * Returns name of the plane
     * @return String
     */
    public String getName(){
        return name;
    }
    /**
     * returns purpose of the plane
     * @return String
     */
    public String getPurpose(){
        return purpose;
    }
}
