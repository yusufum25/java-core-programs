/* Author: @ItsYusufDemir
 * Date: 7 Mar 2023 20:44:54
 * 
 * Description: Make a addition quiz.
 */
package listing_3_1;

import java.util.Scanner;


public class AdditionQuiz {
	
	public static void main(String args[]) {
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " + " + number2 + "?");
		int answer = input.nextInt();
		
		System.out.println(number1 + number2 == answer);	

	}

}
