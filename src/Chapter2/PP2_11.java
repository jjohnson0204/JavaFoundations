package Chapter2;

import java.util.Scanner;

public class PP2_11 {
    /*  Write an application that prompts for and reads the numerator and denominator
        of a fraction as integers and then prints the deci-mal equivalent of the fraction.
     */

    public static void main(String[] args) {
        int numerator, denominator, fraction;
        double  decimal;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numerator and denominator-");
        System.out.print("Enter numerator: ");
        numerator = input.nextInt();
        System.out.print("Enter denominator: ");
        denominator = input.nextInt();
        fraction = numerator / denominator;
        decimal = fraction * 1.0;
        System.out.println("Fractal form: " + numerator + "/" + denominator + ".");
        System.out.println("Decimal form: " + decimal + ".");
    }
}
