/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 16:26:51
 * 
 * Description: Display the time with the given time zone.
 */
package exercise_2_8;

import java.util.Scanner;


public class DisplayTimeWithGMT {
	
	public static void main(String args[]) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your time zone (ex: -5, 3): ");
		int timeZone = input.nextInt();
		
		while(true) {
			
			long totalMilliseconds = System.currentTimeMillis() + timeZone * 3600 * 1000;
			
			long totalSeconds = totalMilliseconds / 1000;
			byte currentSecond = (byte) (totalSeconds % 60);
			
			long totalMinutes = totalSeconds / 60;
			byte currentMinute = (byte) (totalMinutes % 60);
			
			long totalHours = totalMinutes / 60;
			byte currentHour = (byte) (totalHours % 24);
			
			System.out.println("Current time is " + currentHour + ":" + currentMinute
					+ ":" + currentSecond + " GMT");
			
			Thread.sleep(1000);
		}
		
		
		
	}
	
}
	
	


