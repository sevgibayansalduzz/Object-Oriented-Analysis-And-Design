package part3;

public abstract class Suit {
    /**
     * This data field holda description of the suit
     */
    String description="Unknown Suit";

    /**
     * This method rettunrs description of the suit.
     * @return
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * This method returns descripton of he suit with the suit`s cost and weight.
     * @return
     */
    public String wholeCustomDescription(){
        return getDescription()+" "+this.cost()+"k TL "+this.kg()+" kg";
    }

    /**
     * This is an abstract method. Return suit`s cost.
     * @return double- cost of the suit.
     */
    public abstract double cost();
    /**
     * This is an abstract method. Return suit`s weight.
     * @return double- weigth of the suit.
     */
    public abstract double kg();
}
