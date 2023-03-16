/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 19:25:23
 * 
 * Description: Calculate the future investment value with the given inputs: investment amount, years and interest rate.
 */
package exercise_2_21;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("Enter number of years: ");
		int numberOfYears = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
		
		System.out.println("Accumulated value is $" + ((int)(futureInvestmentValue * 100)) / 100.0);
		
		
	}

}
