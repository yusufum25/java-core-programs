/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 17:40:58
 * 
 * Description: A type casting example is given by a tax calculator.
 */
package listing_2_8;

import java.util.Scanner;


public class SalesTax {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter puchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		
		System.out.println("Sales tax is $" + ((int)(tax * 100)) / 100.0);
		
		
	}

}
