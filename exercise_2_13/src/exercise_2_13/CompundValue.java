/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 17:21:41
 * 
 * Description: Find the balance of an account that is saved $x dollars every month
 * by getting the annual interest rate
 */
package exercise_2_13;

import java.util.Scanner;

public class CompundValue {

	public static void main(String args[] ) {
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter the monthly saving amount: ");
	    double monthlySaving = input.nextDouble();
	    
	    System.out.println("Enter the annual interest rate (ex. 12): ");
	    double annualInterestRate = input.nextDouble();
	    
	    double monthlyInterestRate = annualInterestRate / 1200;
	    
	    double firstMonth = (monthlySaving) * (1 + monthlyInterestRate);
	    double secondMonth = (monthlySaving + firstMonth) * (1 + monthlyInterestRate);
	    double thirdMonth = (monthlySaving + secondMonth) * (1 + monthlyInterestRate);
	    double fourthMonth = (monthlySaving + thirdMonth) * (1 + monthlyInterestRate);
	    double fifthMonth = (monthlySaving + fourthMonth) * (1 + monthlyInterestRate);
	    double sixthMonth = (monthlySaving + fifthMonth) * (1 + monthlyInterestRate);
	    
	    System.out.println("First month: " + firstMonth);
	    System.out.println("Second month: " + secondMonth);
	    System.out.println("Third month: " + thirdMonth);
	    System.out.println("6th month: " + sixthMonth);
		
	}
}
