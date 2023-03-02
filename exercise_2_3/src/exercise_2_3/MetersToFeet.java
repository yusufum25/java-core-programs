/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 15:51:41
 * 
 * Description: Convert meters to feet.
 */
package exercise_2_3;

import java.util.Scanner;


public class MetersToFeet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in meters: ");
		double meters = input.nextDouble();
		
		double feet = meters * 3.2808399;
		
		System.out.println(meters + " meters is " + feet + " feet.");

	}

}
