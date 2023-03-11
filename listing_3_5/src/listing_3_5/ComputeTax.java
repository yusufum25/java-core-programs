/* Author: @ItsYusufDemir
 * Date: 11 Mar 2023 20:14:06
 * 
 * Description: Compute tax for people in US according to their marital status.
 */
package listing_3_5;

import java.util.Scanner;



public class ComputeTax {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your status: " 
				+ "\n1. Single"
				+ "\n2. Married Filling Jointly or Qualifying Widow(er)"
				+ "\n3. Married Filling Seperately"
				+ "\n4. Head of Household");
		int status = input.nextInt();
		
		
		double tax = 0;
		
		//Here is the ranges for the current status
		double percentage10 = 0;
		double percentage15 = 0;
		double percentage25 = 0;
		double percentage28 = 0;
		double percentage33 = 0;
		
		if(status == 1) { //Single
			
			percentage10 = 8350;
			percentage15 = 33950;
			percentage25 = 82250;
			percentage28 = 171550;
			percentage33 = 372950;
	
		}	
		else if (status == 2) {  //Married Filling or Qualifying Widow(er)
			
			percentage10 = 16700;
			percentage15 = 67900;
			percentage25 = 137050;
			percentage28 = 208850;
			percentage33 = 372950;
			
		}
		else if (status == 3) { //Married Filling Separately
			
			percentage10 = 8350;
			percentage15 = 33950;
			percentage25 = 68525;
			percentage28 = 104425;
			percentage33 = 186475;
			
		}
		else if (status == 4) { //Head of Household
			
			percentage10 = 11950;
			percentage15 = 45500;
			percentage25 = 117450;
			percentage28 = 190200;
			percentage33 = 372950;
			
		}
		else {
			System.out.println("Invalid status!");
			System.exit(1);
		}
		
		
		System.out.println("Enter your taxable income: ");
		double income = input.nextDouble();
		
		
		if (income <= percentage10) {
			tax = income * 0.1; 
		}
		else if (income <= percentage15) {
			tax = percentage10 * 0.1 + (income - percentage10) * 0.15;
		}
		else if (income <= percentage25) {
			tax = percentage10 * 0.1 + (percentage15 - percentage10) * 0.15 + (income - percentage15) * 0.25;
		}
		else if (income <= percentage28) {
			tax = percentage10 * 0.1 + (percentage15 - percentage10) * 0.15
					+ (percentage25 - percentage15) * 0.25 + (income - percentage25) * 0.28;
		}
		else if (income <= percentage33) {
		tax = percentage10 * 0.1 + (percentage15 - percentage10) * 0.15 + (percentage25 - percentage15) * 0.25 + (percentage28 - percentage25) * 0.28
				+ (income - percentage28) * 0.33;
		}
		else {
			tax = percentage10 * 0.1 + (percentage15 - percentage10) * 0.15 + (percentage25 - percentage15) * 0.25 + (percentage28 - percentage25) * 0.28
					+ (percentage33 - percentage28) * 0.33 + (income - percentage33) * 0.35;
		}
		
		
		
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);

		
	}

}
