package part1;

import java.util.Scanner;

public class GaussianElimination implements SolverMethod {

    /**
     * this data field holds the number of variables of the linear equations.
     */
    private int numberOfVariables;
    /**
     * this data fiels holds the coefficients of the linear equations.
     */
    private double [][] coefficients;
    /**
     * this data fiels holds the solutions of the linear qeuations.
     */
    private double[] solutions;

    /**
     * Default constructor.
     * It takes the following inputs respectively from the user: the number of linear equations, coefficients and solutions.
     */
    public GaussianElimination() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter number of variables");
        numberOfVariables= scan.nextInt();
        while (numberOfVariables<=1)
        {
            System.out.println("Number of variables must be bigger than 1");
            numberOfVariables=scan.nextInt();
        }
        coefficients=new double[numberOfVariables][numberOfVariables];
        solutions=new double[numberOfVariables];

        System.out.println("Enter equations coefficients.");
        for (int i=0;i<numberOfVariables;++i){
            System.out.println("\n"+i+". equation`s coefficents = ");
            for (int j=0;j<numberOfVariables;++j)
                coefficients[i][j]=scan.nextDouble();
        }

        System.out.println("Enter solutions.");
        for (int i=0;i<numberOfVariables;++i)
            solutions[i]=scan.nextDouble();
    }

    /**
     * This method solves the linear equations with the two helpers method, then prints the solution.
     */
    @Override
    public void solution() {

        findUpperTriangularMatrix(coefficients,solutions);
        backSubstition(coefficients,solutions);
        int i=0;
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        do{

            sb.append(solutions[i]);
            i++;
        }while (i<solutions.length && sb.append(",")==sb );
        sb.append("]");
        System.out.println(sb.toString());
    }

    /**
     * It takes coeeficents as a matirx and solution as a list.
     * Then find an upper triangular matrix.
     * @param matrix equation matix
     * @param solution solutions of the equations
     */
    public void findUpperTriangularMatrix(double [][] matrix, double [] solution){

        for(int i=0;i<matrix.length;++i){

            int maxRow=i;
            //change maximum row of the matrix with the ith row
            for(int r=i ; r<matrix.length;++r)
                if(matrix[r][i]>matrix[maxRow][i])
                    maxRow=r;
            //swaping maximimum row ith first row
            double[] temp=matrix[i];
            matrix[i]=matrix[maxRow];
            matrix[maxRow]=temp;
            //swapping solutions
            double tempS=solution[i];
            solution[i]=solution[maxRow];
            solution[maxRow]=tempS;

            //make elements zero which are under the ith row
            //use this equation to make elements zero:
            // matrix[target][col]=matrix[target][col]-matrix[max_row][col]*(matrix[target][0]/matrix[max_row][0])
            for (int r=i+1; r<matrix.length;++r)
            {
                double constant= matrix[r][i]/matrix[i][i];
                for (int j=i;j<matrix.length;++j)
                {
                    matrix[r][j]=matrix[r][j]-constant*matrix[i][j];
                }
                solution[r]=solution[r]-solution[i]*constant;
            }
        }
    }

    /**
     *This method use back substituion to find solutions.
     * @param matrix upper triangular matix
     * @param solution solutions of the equations
     */
    public void backSubstition(double[][] matrix, double[] solution)
    {
        double [] sols=new double[solution.length];
        for(int i=matrix.length-1;i>=0;--i){
            for(int j=i+1;j<matrix.length;++j)
                solution[i]-=(matrix[i][j]*solution[j]);
            solution[i]=solution[i]/matrix[i][i];
        }
    }
}
