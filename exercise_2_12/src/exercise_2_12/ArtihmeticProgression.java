/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 17:13:38
 * 
 * Description: Compute the n th term of a seqeunce by getting a1 and difference of members.
 */
package exercise_2_12;

import java.util.Scanner;

public class ArtihmeticProgression {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a1 and d (difference of members) and the n.th term: ");
		double a1 = input.nextDouble();
		double d = input.nextDouble();
		int term = input.nextInt();
		
		double answer = a1 + (term - 1) * d;
		
		System.out.println(term + "th term is " + answer);
		
	
		
	}

}
