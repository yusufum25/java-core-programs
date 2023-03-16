/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 15:55:12
 * 
 * Description: Convert square meter to ping.
 */
package exercise_2_4;

import java.util.Scanner;



public class SquareMeterToPing {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in square meters: ");
		double squareMeters = input.nextDouble();
		
		double ping = squareMeters * 0.30257186081694;
		
		System.out.println(squareMeters + " square meters is " + ping + " ping.");
		
		
	}

}
