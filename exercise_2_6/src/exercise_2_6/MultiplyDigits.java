/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 16:07:10
 * 
 * Description: Multiply the digits of an integer.
 */
package exercise_2_6;

import java.util.Scanner;

public class MultiplyDigits {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 100 and 999");
		int integer = input.nextInt();
		int currentInteger = integer;
		
		int multiple = currentInteger % 10;
		currentInteger /= 10;
		
		multiple *= currentInteger % 10;
		currentInteger /= 10;
		
		multiple *= currentInteger;
		
		System.out.println("Multiplicity of digits of the " + integer + " is " + multiple + ".");
		
		
	}

}
