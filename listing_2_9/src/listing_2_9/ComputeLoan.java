/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 17:57:11
 * 
 * Description: Compute monthly and total payment of a loan by getting 
 * some inputs.
 */
package listing_2_9;

import java.util.Scanner;


public class ComputeLoan {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		int numberOfYears = input.nextInt();
		
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1) / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		
		System.out.println("Monthly payment $" + ((int)(monthlyPayment * 100)) / 100.0 );
		System.out.println("Total payment $" + ((int)((monthlyPayment * numberOfYears * 12) * 100)) / 100.0);
		
		
		
	}
	

}
