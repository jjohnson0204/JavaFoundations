package Chapter2;

import java.util.Scanner;

public class PP2_2 {
    /*  Write an application that reads three integers and prints their average.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers to get the average.");
        System.out.println("Enter 1st number: ");
        double a = input.nextDouble();
        System.out.println("Enter 2nd number: ");
        double b = input.nextDouble();
        System.out.println("Enter 3rd number: ");
        double c = input.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println( "The average of " +
                a + " + " +
                b + " + " +
                c + " + " +
                "= " + average);
    }
}
