/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 15:23:31
 * 
 * Description: With the given amount find the dollars, quarters(25 cent), dimes(10 cents), nickels(5 cents)
 * and pennies(1 cent).
 */
package listing_2_10;

import java.util.Scanner;


public class ComputeChange {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Etner the amount: ");
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
		
		System.out.println(amount + " is\n\n\t" + dollars + " dollars\n\t" + quarters + " quarters\n\t" +
		dimes + " dimes\n\t" + nickels + " nickels\n\t" + cents + " pennies");
		
		
		
		
	}
}
