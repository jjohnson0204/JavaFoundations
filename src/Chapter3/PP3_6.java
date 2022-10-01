package Chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PP3_6 {
    /*  Write an application that reads the lengths of the sides of a triangle from the user.
        Compute the area of the triangle using Heron’s formula (below), in which s represents half
        of the perimeter of the triangle, and a, b, and c represent the lengths of the three sides.
        Print the area to three decimal places.
        Area=sqrt(s(s-a)(s-b)(s-c)
    */

    public static void main(String[] args) {
        int a, b, c, s, p;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the 3 sides of a triangle-");
        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();
        System.out.print("c: ");
        c = input.nextInt();
        p = a + b + c;
        s = p/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("The area for this triangle is: ");
        System.out.format("%.3f", area);
    }
}
