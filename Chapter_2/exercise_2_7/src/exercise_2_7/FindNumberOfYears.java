/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 16:20:02
 * 
 * Description: Find the number of years by given minutes.
 */
package exercise_2_7;

import java.util.Scanner;



public class FindNumberOfYears {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter minutes: ");
		long minutes = input.nextLong();
		
		long totalDays = minutes / (24*60);
		long totalYears = totalDays / 365;
		
		System.out.println(minutes + " minutes is approximately " + totalYears + " years and " + (totalDays % 365) + " days.");
		
		
	}

}
