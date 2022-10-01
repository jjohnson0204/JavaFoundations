package Chapter2;

public class PP2_4 {
    /*  Create a version of the TempConverter application to convert from Fahrenheit to Celsius.
        Read the Fahrenheit temperature from the user.
    */

    public static void main(String[] args) {
        final int BASE = 32;
        // Computes the Fahrenheit equivalent of a specific Celsius
        // value using the formula F = (9/5)C + 32.
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        double fahrenheitTemp;
        int celsiusTemp = 24; // value to convert
        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}
