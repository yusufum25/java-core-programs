/* Author: @ItsYusufDemir
 * Date: 7 Mar 2023 20:51:11
 * 
 * Description: Using a if statement.
 */
package listing_3_2;

import java.util.Scanner;

public class SimpleIfDemo {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		
		if(integer % 5 == 0) {
			System.out.println("HiFive");
		}
		
		if(integer % 2 == 0) {
			System.out.println("HiEven");
		}
		
		
	}

}
