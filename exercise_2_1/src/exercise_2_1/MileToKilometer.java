/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 15:38:12
 * 
 * Description: Convert miles to kilometers.
 */
package exercise_2_1;

import java.util.Scanner;

public class MileToKilometer {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in miles: ");
		double miles = input.nextDouble();
		
		double kilometers = miles * 1.609344;
		
		System.out.println(miles + " miles is " + kilometers + " kilometers.");
		
	}

}
