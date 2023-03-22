/* Author: @ItsYusufDemir
 * Date: 22.03.2023 19:56
 *
 * Description: Printing with monetary units for the project listing_2_10
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double amount = input.nextDouble();
        int cents = (int)(amount * 100);

        int dollars = cents / 100;
        cents = cents % 100; //Remaining cents

        int quarters = cents / 25;
        cents = cents % 25;

        int dimes = cents / 10;
        cents = cents % 10;

        int nickels = cents / 5;
        cents = cents % 5;

        printAmount(amount, dollars, quarters, dimes, nickels, cents);

    }


    public static void printAmount(double amount, int dollars, int quarters, int dimes, int nickels, int cents){

        System.out.println(amount + " is \n");

        System.out.println("\t" + dollars + (dollars > 1 ? " dollars" : " dollar"));
        System.out.println("\t" + quarters + (quarters > 1 ? " quarters" : " quarter"));
        System.out.println("\t" + dimes + (dimes > 1 ? " dimes" : " dime"));
        System.out.println("\t" + nickels + (nickels > 1 ? " nickels" : " nickel"));
        System.out.println("\t" + cents + (cents > 1 ? " cents" : " cent"));

    }

}
