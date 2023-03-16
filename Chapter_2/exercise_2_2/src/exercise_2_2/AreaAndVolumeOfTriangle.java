/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 15:43:28
 * 
 * Description: Compute the area and volume of a equilateral triangle.
 */
package exercise_2_2;

import java.util.Scanner;


public class AreaAndVolumeOfTriangle {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side length of the equilateral triangle: ");
		double sideLength = input.nextDouble();
		
		double area =  (Math.pow(3, 1.0/2) / 4) * (sideLength * sideLength);
		double volume = area * sideLength;
		
		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
		
		
	}

}
