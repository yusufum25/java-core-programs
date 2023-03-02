import java.util.Scanner;

/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 15:59:42
 * 
 * Description: Find the gratuity and total.
 */

public class FindGratuity {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter subtotal: ");
		double subtotal = input.nextDouble();
		System.out.println("Enter gratuity rate (ex. 12): ");
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);
		
		System.out.println("The gratuity is " + gratuity + " and total is " + (subtotal + gratuity) + ".");
		
	}

}
