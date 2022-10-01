package Chapter2;

import java.util.Scanner;

public class PP2_10 {
    /*  Write an application that prompts for and reads an integer representing
        the length of a square’s side and then prints the square’s perimeter and area.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the side of the square: ");
        int number = input.nextInt();
        System.out.println("The size for each side of the square is: " + number);
        int perimeter   = 4 * number,
                area    = number * number;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
