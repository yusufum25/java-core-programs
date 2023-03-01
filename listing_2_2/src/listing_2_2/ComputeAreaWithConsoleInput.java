/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 15:06:44
 * 
 * Description: Compute the area of a circle by getting the radius from the user.
 */
package listing_2_2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	
	public static void main(String args[]) {
		
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius: ");
		radius = input.nextDouble();
		
		area = 3.1415 * radius * radius;
		
		System.out.println("Area of the circle with radius " + radius + " is " + area);
		
		
		
	}

}
