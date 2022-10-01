package Chapter3;

import java.util.Scanner;

public class PP3_5 {
    /*  Write an application that reads the radius of a sphere and prints its volume and surface area.
        Use the following formulas, in which r represents the sphere’s radius.
        Print the output to four decimal places.
        Volume=4/3pir^3
        SurfaceArea=4pir^2
    */

    public static void main(String[] args) {
        int r;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the radius of the circle-");
        System.out.print("r: ");
        r = input.nextInt();
        double v = ( 4.0 / 3.0 ) * Math.PI * Math.pow( r, 3 );
        double s = (4.0) * Math.PI * Math.pow(r,2);
        System.out.print("Volume: ");
        System.out.format("%.4f", v);
        System.out.println();
        System.out.print("Surface Area: ");
        System.out.format("%.4f", s);
    }
}
