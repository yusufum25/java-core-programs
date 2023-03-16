/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 19:37:28
 * 
 * Description: Calculating the sum of a sequence.
 */
package exercise_2_22;

import java.util.Scanner;

public class SumOfSequence {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a1: ");
		double a1 = input.nextDouble();
		
		System.out.println("Enter nth term: ");
		double nthTerm = input.nextDouble();
		
		System.out.println("Enter n: ");
		int n = input.nextInt();
		
		double sum = n * (a1 + nthTerm) * 0.5;
		
		System.out.println("Sum is: " + sum);
		
	}

}
