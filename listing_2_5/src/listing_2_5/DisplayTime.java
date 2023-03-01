/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 16:30:29
 * 
 * Description: Display the hours, minutes and second by the given input in seconds.
 */
package listing_2_5;

import java.util.Scanner;


public class DisplayTime {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter seconds: ");
		int seconds = input.nextInt();
		
		int second = (int) (seconds % 60);
		
		int minutes = seconds / 60;
		int minute = minutes % 60;
		
		int hours = minutes / 60;
		
		System.out.println(hours + " hours  " + minute + " minutes  " + second + " seconds");
		
		
		
		
	}

}
