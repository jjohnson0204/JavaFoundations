package Chapter3;

import java.util.Scanner;

public class PP3_4 {
    /*  Write an application that reads the (x, y) coordinates for two points.
        Compute the distance between the two points using the following formula:
        Distance=sqrt(x2-x1)^2+(y2-y1)^2)
    */

    public static void main(String[] args) {
        double x1,x2,y1,y2,distance;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the the (x and y) for 2 points-");
        System.out.println(
                "X1: " + (x1=input.nextDouble()) + "\n" +
                "Y1: " + (y1=input.nextDouble()) + "\n" +
                "X2: " + (x2=input.nextDouble()) + "\n" +
                "Y2: " + (y2=input.nextDouble()) + "\n"
        );
        distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("The distance between the 2 points is: " + distance);
    }
}
