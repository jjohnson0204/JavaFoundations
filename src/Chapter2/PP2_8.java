package Chapter2;

import java.util.Scanner;

public class PP2_8 {
    /*  Write an application that determines the value of the coins in a jar
        and prints the total in dollars and cents. Read integer values that represent
        the number of quarters, dimes, nickels, and pennies.
    */

    public static void main(String[] args) {
        double quarters = .25,
                dimes   = .10,
                nickels = .05,
                pennies = .01;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for each denomination to get total-");
        System.out.print("Quarters: ");
        double q = input.nextDouble();
        quarters = q * quarters;
        System.out.print("Dimes: ");
        double d = input.nextDouble();
        dimes = d * dimes;
        System.out.print("Nickels: ");
        double n = input.nextDouble();
        nickels = n * nickels;
        System.out.print("Pennies: ");
        double p = input.nextDouble();
        pennies = p * pennies;
        double total = quarters + dimes + nickels + pennies;
        System.out.print("The total in jar is: " + total);
    }
}
