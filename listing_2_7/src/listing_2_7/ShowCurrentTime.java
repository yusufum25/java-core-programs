/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 17:22:38
 * 
 * Description: Show the current time by calculating from milliseconds.
 */
package listing_2_7;

public class ShowCurrentTime {

	public static void main(String args[]) throws InterruptedException {
		
	
		while(true) {
			
			long totalMilliseconds = System.currentTimeMillis();
			
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
