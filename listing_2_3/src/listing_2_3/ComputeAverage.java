/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 15:45:12
 * 
 * Description: Compute the average of three numbers.
 */
package listing_2_3;


import java.util.*;

public class ComputeAverage {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double average = (number1 + number2 + number3) / 3;

		System.out.println("Average is " + average);
		
		
	}

}
