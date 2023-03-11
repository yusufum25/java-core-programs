/* Author: @ItsYusufDemir
 * Date: 11 Mar 2023 19:52:21
 * 
 * Description: Calculate the BMI with the given mass and height then, interpret the calculation.
 */
package listing_3_4;

import java.util.Scanner;


public class ComputeAndInterpretBMI {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your mass (kilogram) and height (centimeters): ");
		double mass = input.nextDouble();
		double height = input.nextDouble() / 100;
		
		double bmi = mass / (height * height);
		System.out.println("Your BMI is " + (
				(int)(bmi * 100)) / 100.0);
		
		if(bmi < 18.5) {
			System.out.println("Underweight.");
		}
		else if (bmi < 25) {
			System.out.println("Normal.");
		}
		else if (bmi < 30) {
			System.out.println("Overweight.");
		}
		else {
			System.out.println("Obese.");
		}
		
	}

}
