package Chapter3;

import java.util.Random;

public class PP3_3 {

    /*  Write an application that creates and prints a random phone number of the form XXX-XXX-XXXX.
        Include the dashes in the output. Do not let the first three digits contain an 8 or 9
        (but don’t be more restrictive than that), and make sure that the second set of three digits
        is not greater than 742. Hint: Think through the easiest way to construct the phone number.
        Each digit does not have to be determined separately.
    */
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print(random.nextInt(7));
        System.out.print(random.nextInt(7));
        System.out.print(random.nextInt(7) + "-");
        System.out.print(random.nextInt(741) + "-");
        System.out.print(random.nextInt(9998));
    }

}
