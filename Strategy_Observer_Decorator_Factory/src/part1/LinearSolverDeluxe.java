package part1;

public class LinearSolverDeluxe {

    /**
     * This data field is used to hold a reference to a specific method behavior at runtime.
     * The behavior variable is declared as the behavior INTERFACE type.
     */
    SolverMethod methodBehavior;

    /**
     *Default constructor is not implemented.
     */
    public LinearSolverDeluxe(){}

    /**
     *The LinearSolverDeluxe object delegates that solver method to the object referenced by SolverMethod.
     */
    public void performSolution(){
        methodBehavior.solution();
    }

    /**
     *This method sets methodBehavior dynamically.
     *It takes an  object referenced by SolverMethod and assigns this object to the methodBehavior data field.
     * @param methodBehavior This data field is used to hold a reference to a specific method behavior at runtime.
     */
    public void setMethodBehavior(SolverMethod methodBehavior)
    {
        this.methodBehavior=methodBehavior;
    }
}
