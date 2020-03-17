package part1;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSolverDeluxeSimilator {
    public static void main(String[] args) {
        LinearSolverDeluxe solverDeluxe=new LinearSolverDeluxe();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------WELCOME TO THE LINEARSOLVERDELUXE--------");
        System.out.println("FOR STARTING PLEASE SELECT A METHOD");
        while (true){
            System.out.println("FOR MATRIX INVERSION ENTER: 1");
            System.out.println("FOR GAUSSIAN ELIMINATION ENTER: 2");
            System.out.println("FOR EXITING ENTER: 3");
            int choice=scan.nextInt();
            if (choice==1)
            {
                solverDeluxe.setMethodBehavior(new MatrixInversion());
                solverDeluxe.performSolution();
            }else if(choice==2)
            {
                solverDeluxe.setMethodBehavior(new GaussianElimination());
                solverDeluxe.performSolution();
            }else if(choice==3)
            {
                System.out.println("EXITING");
                break;
            }
            else
                System.out.println("Wrong input!!");
        }
    }
}
