/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 19:44:05
 * 
 * Description: Calculate the cost of driving by given inputs.
 */
package exercise_2_23;

import java.util.Scanner;

public class CostOfDriving {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		
		System.out.println("Enter miles per gallong: ");
		double milesPerGallon  = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double numberOfGallons = drivingDistance / milesPerGallon;
		double cost = numberOfGallons * pricePerGallon;
		
		System.out.println("The cost of driving is $" + cost);
		
	}

}
