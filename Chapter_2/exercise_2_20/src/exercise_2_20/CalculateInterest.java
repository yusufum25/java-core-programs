/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 19:21:41
 * 
 * Description: Calculate the interest for the next month.
 */
package exercise_2_20;

import java.util.Scanner;

public class CalculateInterest {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and annual interest rate: ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double interest = balance * monthlyInterestRate;
		
		System.out.println("Interest is: " + interest);
		
	}

}
