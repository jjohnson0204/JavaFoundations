package Chapter2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PP2_9 {
    /*  Write an application that prompts for and reads a double value representing a monetary amount.
        Then determine the least num-ber of each bill and coin needed to represent that amount, starting with the highest
        (assume that a ten-dollar bill is the maximum size needed). For example, if the value entered is 47.63
        (forty-seven dollars and sixty-three cents), then the program should print the equivalent amount as
        4 ten dollar bills
        1 five dollar bills
        2 one dollar bills
        2 quarters
        1 dimes
        0 nickels
        3 pennies
    */

    /*
    - Types of Bills
        - 1 Dollar
        - 5 Dollar
        - 10 dollars
        - 20 dollars
        - 50 dollars
        - 100 dollars
      - Type of coins
        - pennies
        - dimes
        - nickels
        - quarters

      - Input is a Double
      - What we want
        Double -> [Bills, Coins]
     */

    public static void main(String[] args) {
        System.out.println("Type an amount of money: ");
        Scanner input = new Scanner(System.in);
        double moneies = input.nextDouble();
        int money = (int) Math.round(moneies * 100.000);
        ArrayList<Integer> bills = new ArrayList<Integer>();
        bills.add(100 * 100); //100 bill
        bills.add(50 * 100); //50 bills
        bills.add(20 * 100); //20 bills
        bills.add(10 * 100 ); //10 bills
        bills.add(5 * 100); //5 bills
        bills.add(100); //1 bills
        bills.add(25);
        bills.add(10 );
        bills.add(5 );
        bills.add(1);
        StringBuilder payoutStr = new StringBuilder();
        ArrayList<String>  payout = new ArrayList<String>();
        payout.add("   hundred dollar bill(s)");
        payout.add("   fifty dollar bill(s)");
        payout.add("   twenty dollar bill(s)");
        payout.add("   ten dollar bill(s)");
        payout.add("   five dollar bill(s)");
        payout.add("   one dollar bill(s)");
        payout.add("   quarters");
        payout.add("   dimes");
        payout.add("   nickels");
        payout.add("   pennies");

        for(var i = 0; i < bills.size(); i++) {
            if(money == 0) {
                payoutStr.append(0 + payout.get(i) + "\n");
                continue;
            }
            int bill = bills.get(i);
            int amount = money / bill;
            int remainder = money % bill;
            money = remainder;
            payoutStr.append(amount + payout.get(i) + "\n");

        }
        System.out.println("Given the dollar amount $" + moneies);
        System.out.println(payoutStr.toString());
    }
}
