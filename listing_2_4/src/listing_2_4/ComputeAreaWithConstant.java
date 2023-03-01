/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 16:13:43
 * 
 * Description: Calculate the area of a circle by using constant.
 */
package listing_2_4;

import java.util.Scanner;

public class ComputeAreaWithConstant {
	
	public static void main(String args[]) {
		
		final double PI = 3.1415;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * PI;
		System.out.println("Area of the circle with radius " + radius + " is " + area);
		
		
	}

}
