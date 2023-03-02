/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 17:03:27
 * 
 * Description: Find the population after x years according to the U.S Census Bureau data.
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Current population = 312,032,486
 */
package exercise_2_11;

import java.util.Scanner;

public class PopulationProjection {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter to see the population after years: ");
		int years = input.nextInt();
		
		long population = 312_032_486;
		long secondsPassed = 3600 * 24 * 365 * years;
		population += (secondsPassed / 7) + (secondsPassed / 45) - (secondsPassed / 13);
		
		System.out.println("After " + years + " years, population will be " + population);
		
	}

}
