package Chapter2;

import java.util.Scanner;

public class PP2_6 {
    /*  Write an application that reads values representing a time duration in
         hours, minutes, and seconds, and then prints the equivalent total number of seconds.
         (For example, 1 hour, 28 minutes, and 42 seconds is equivalent to 5322 seconds.)
     */

    public static void main(String[] args) {
        int seconds = 1;
        int minutes = seconds * 60;
        int hour = minutes * 60;

        Scanner input = new Scanner(System.in);
        System.out.println("Get the total duration of time in seconds:");
        System.out.print("Hours: ");
        int a = input.nextInt();
        int hr = a * hour;
        System.out.print("Minutes: ");
        int b = input.nextInt();
        int min = b * minutes;
        System.out.print("Seconds: ");
        int c = input.nextInt();
        int sec = c * seconds;
        int result = hr + min + sec;
        System.out.print("Total time in seconds: " + result);
    }
}
