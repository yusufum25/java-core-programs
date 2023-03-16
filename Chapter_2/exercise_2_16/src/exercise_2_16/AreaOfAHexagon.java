/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 18:03:08
 * 
 * Description: Compute the area of a hexagon.
 */
package exercise_2_16;

import java.util.Scanner;

public class AreaOfAHexagon {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side length of the hexagon: ");
		double sideLength = input.nextDouble();
		
		double area = ((3 * Math.pow(3, 0.5)) / 2) * sideLength * sideLength;
		
		System.out.println("The area is : " + area);
		
	}

}
