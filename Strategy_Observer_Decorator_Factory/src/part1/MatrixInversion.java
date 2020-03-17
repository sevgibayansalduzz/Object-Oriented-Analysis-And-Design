package part1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixInversion implements SolverMethod {

    /**
     * this data field holds the number of variables of the linear equations.
     */
    private int numberOfVariables;
    /**
     * this data fiels holds the elemetns of the matrix.
     */
    private double [][] matrix;


    /**
     *
     * It takes the following inputs respectively from the user:
     * the number of rows and elemants of matrix.
     */
    public MatrixInversion() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dimension of matrix:");
        numberOfVariables= scan.nextInt();
        while (numberOfVariables<=1)
        {
            System.out.println("Number of variables must be bigger than 1. Enter again:");
            numberOfVariables=scan.nextInt();
        }
        matrix=new double[numberOfVariables][numberOfVariables];

        System.out.println("Enter the elements of matrix.");
        for (int i=0;i<numberOfVariables;++i){
            System.out.print("\n"+i+". row : ");
            for (int j=0;j<numberOfVariables;++j)
                matrix[i][j]=scan.nextDouble();
        }
    }

    /**
     *
     * This method solves the matrix inversion with the helper method,inverse(). Then prints the inverse of the matrix.
     */
    @Override
    public void solution() {
        double[][] inverse=inverse(matrix);
        for(int i=0;i<inverse.length;++i)
        {
            for (int j=0;j<inverse.length;++j)
                System.out.print(inverse[i][j]+" ");
            System.out.println();
        }
    }

    /**
     * This method create a matrix of minors.
     * @param source given matrix
     * @param row index of the row
     * @param column index of the column
     * @return
     */
    public  double[][] subArray(double[][] source, int row, int column)
    {
        double[][] temp=new double[source.length-1][source.length-1];
        for(int i=0,k=0;i<source.length;++i)
        {
            for (int j=0,l=0;j<source.length;++j)
            {
                if(i!=row && j!=column)
                {
                    temp[k][l]=source[i][j];
                    l++;
                }
            }
            if (i!=row)
                k++;
        }
        return temp;
    }

    /**
     * This recursive method calculates the determinant of the given matrix and return the result.
     * @param source a matrix
     * @return determinant of the matrix.
     */
    public  double determinant(double[][]source)
    {
        double res=0;
        //if matrix has 1 dimension simply return itself
        if (source.length==1)
            return source[0][0];
        //if matrix has 2 dimension simply calculate its determinant
        else if(source.length==2){
            return source[0][0]*source[1][1]-source[0][1]*source[1][0];
        }
        //else find the minor of given matrix and calculates their determinants
        else{
            for (int i=0;i<source[0].length;++i)
            {
                // calls SubArray for get matrix of minors. Because first calculates determinant of the minors then
                //uses this determinant for the calculates determinant of the given matrix.
                double [][] temp=subArray(source,0,i);
                res+= source[0][i]*Math.pow(-1,i)*determinant(temp);
            }
            return res;
        }

    }

    /*
    For each element, calculate the determinant of the values not on the row or column, to make the Matrix of Minors
    Apply a checkerboard of minuses to make the Matrix of Cofactors
    Transpose to make the Adjugate
    Multiply by 1/Determinant to make the Inverse
    */

    /**
     * Finds adjoint of the given matrix.
     * @param source a matrix
     * @return adjoint matrix of the given matrix.
     */
    public  double[][] adjoint (double[][]source)
    {
        double [][] res= new double[source.length][source.length];
        for (int i=0;i<source.length;++i){
            for(int j=0;j<source.length;++j)
            {
                double temp[][]=subArray(source,i,j);
                res[j][i]=Math.pow(-1,j)*determinant(temp);
            }
        }
        return res;
    }

    /**
     * Firstly calculates determinant of the given matrix.
     * Then find the adjoint matrix of the given matrix
     * Finally multiply adjoint matrix with the 1/determinant.
     * @param source a mattrix
     * @return inverse of given matrix.
     */
    public  double[][] inverse (double[][]source) {
        double det=1/determinant(source);
        double  [][] adjoint=adjoint(source);
        for (int i=0;i<adjoint.length;++i){
            for(int j=0;j<adjoint.length;++j)
            {
                adjoint[i][j]=det*adjoint[i][j];
            }
        }
        return adjoint;
    }
}
