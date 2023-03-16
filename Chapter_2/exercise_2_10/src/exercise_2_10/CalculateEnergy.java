/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 16:56:29
 * 
 * Description: Calculate the energy needed for temperature change of water.
 */
package exercise_2_10;

import java.util.Scanner;

public class CalculateEnergy {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double mass = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energyNeeded = mass * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("Energy need: " + energyNeeded + " joule.");
		
		
	}

}
