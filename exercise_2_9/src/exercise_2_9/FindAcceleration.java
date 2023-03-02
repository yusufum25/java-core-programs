/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 16:51:05
 * 
 * Description: Find the acceleration with the given inputs v0, v1 and time (t).
 */
package exercise_2_9;

import java.util.Scanner;

public class FindAcceleration {
	
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0, v1 and time(t): ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double acceleration = (v1 - v0) / t;
		
		System.out.println("Acceleration: " + acceleration + " m/s^2");
	
		
	}
}
