package Chapter2;

import java.util.Scanner;

public class PP2_5 {
    /*  Write an application that converts miles to kilometers.
        (One mile equals 1.60935 kilometers.)
        Read the miles value from the user as a floating point value.
    */

    public static void main(String[] args) {
        float km = 1.60935f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of miles to get result in kilometers");
        float miles = input.nextFloat();
        float result = miles * km;
        System.out.println("Result: " + result);
    }
}
