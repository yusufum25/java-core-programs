import java.util.Scanner;

/* Author: @ItsYusufDemir
 * Date: 11 Mar 2023 21:31:02
 * 
 * Description: Test boolean operators.
 */

public class TestBooleanOperators {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		
		if (integer % 3 == 0 && integer % 2 == 0) {
			System.out.println("It is divisible by 2 and 3.");
		}
		
		if(integer % 3 == 0 || integer % 2 == 0) {
			System.out.println("It is divisble by 2 or 3");
		}
		
		if(integer % 3 == 0 ^ integer % 2 == 0) {
			System.out.println("It is divisble by 2 or 3 but not both.");
		}
		
		
		
	}

}
