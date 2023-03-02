/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 17:42:57
 * 
 * Description: Compute the BMI: m/h^2.
 */
package exercise_2_14;

import java.util.Scanner;

public class ComputeBMI {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight (kg) and height (centimeters): ");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		double BMI = weight / (height * height / 10000);
		
		System.out.println("Your BMI is: " + BMI);
		
	}

}
