package Chapter2;

import java.util.Scanner;

public class PP2_7 {
    /*  Create a version of the previous project that reverses the computation.
        That is, read a value representing a number of seconds, and then print
        the equivalent amount of time as a combination of hours, minutes, and seconds.
        (For example, 9999 seconds is equivalent to 2 hours, 46 minutes, and 39 seconds.)
    */

    public static void main(String[] args) {
        int seconds = 1;
        int minutes = seconds * 60;
        int hour = minutes * 60;

        Scanner input = new Scanner(System.in);
        System.out.println("Get the total time from seconds." );
        int a = input.nextInt();
        int hr = a / hour;
        int hr_remainder = a % hour;
        int min = 0;
        int sec = 0;
        if(hr_remainder > 0 ) {
            min =  hr_remainder / minutes;
            int min_remainder = hr_remainder % minutes;
            if(min_remainder > 0 ) {
                sec = min_remainder;
            }
        }

        System.out.print(a + " seconds= " +
                hr + "hours, " +
                min + "minutes, and " +
                sec + " seconds");
    }
}
