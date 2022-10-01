package Chapter3;

import java.util.Scanner;

public class PP3_2 {
    /*  Write an application that prints the sum of cubes. Prompt for and read two integer values
        and print the sum of each value raised to the third power.
     */

    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter to integers to get cubed value-");
        System.out.print("Value 1: ");
        num1 = (int) Math.pow(input.nextInt(),3);
        System.out.print("Value 2: ");
        num2 = (int) Math.pow(input.nextInt(),3);
        System.out.println("Value 1 cubed: " + num1);
        System.out.println("Value 2 cubed: " + num2);


    }
}
