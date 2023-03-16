import java.util.Scanner;

/* Author: @ItsYusufDemir
 * Date: 11 Mar 2023 21:39:36
 * 
 * Description: Check if it is a leap year.
 */

public class LeapYear {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		boolean isLeapYear = false;
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			isLeapYear = true;
		}
		
		System.out.println(year + " year is a leap year? " + isLeapYear);
		
		
	}

}
