package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class PP3_1 {
    /*  Write an application that prompts for and reads the user’s first name and last name (separately).
        Then print a string composed of the first letter of the user’s first name, followed by the
        first five characters of the user’s last name, followed by a random number in the range 10 to 99.
        Assume that the last name is at least five letters long. Similar algorithms are sometimes used to
        generate usernames for new computer accounts.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name- ");
        System.out.print("First Name: ");
        String first_name = new String(input.next() + "\n");
        System.out.print("Last Name: ");
        String last_name = new String(input.next() + "\n");
        Random random = new Random();
        System.out.println(
                first_name.substring(0,1)+
                last_name.substring(0,5)+
                random.nextInt(89)+10
        );
    }
}
