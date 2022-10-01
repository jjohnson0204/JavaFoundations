package Chapter2;

import java.util.Scanner;

public class PP2_3 {
    /*  Write an application that reads two floating point numbers and prints their
        sum, difference, and product.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 floating numbers to get the sum, difference and product.");
        System.out.println("Enter 1st number: ");
        float a = input.nextFloat();
        System.out.println("Enter 2nd number: ");
        float b = input.nextFloat();
        float sum = a + b;
        float difference = a - b;
        float product = a * b;
        System.out.println("---------------------");
        System.out.println("Here are the results-" + "\n" +
                "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product);
        System.out.println("---------------------");

    }
}
