/* Author: @ItsYusufDemir
 * Date: 11 Mar 2023 19:45:12
 * 
 * Description: Create a subtraction quiz with Math.random().
 */
package listing_3_3;

import java.util.Scanner;


public class SubtractionQuiz {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if(number2 > number1) {
			int temp = number2;
			number2 = number1;
			number1 = temp;
		}
		
		System.out.println("What is " + number1 + " - " + number2 + "?");
		int answer = input.nextInt();
		
		if(answer == number1 - number2) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Wrong! The answer is " + (number1 - number2) + ".");
		}
		
		
		
	}

}
