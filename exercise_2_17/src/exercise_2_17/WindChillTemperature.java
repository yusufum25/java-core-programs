/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 18:12:23
 * 
 * Description: Calculate the wind-chill temperature (the real temperature due to wind) by getting the
 * wind speed and temperature.
 */
package exercise_2_17;

import java.util.Scanner;

public class WindChillTemperature {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58'F and 41'F: ");
		double temperature = input.nextDouble();
		
		System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		double windChillTemperature = 35.74 + 0.6215 * temperature
				+ Math.pow(windSpeed, 0.16) * (0.4275 * temperature - 35.75);
		
		System.out.println("The wind chill temperature: " + windChillTemperature);
		
	}

}
