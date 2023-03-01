/* Author: @ItsYusufDemir
 * Date: 1 Mar 2023 17:14:57
 * 
 * Description: Convert Fahrenheit to Celcius:
 * Celcius = (5/9)(Fahrenheit - 32)
 */
package listing_2_6;

import java.util.*;


public class FahrenheitToCelcius {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println(fahrenheit + " Fahrenheit is " + celcius + " Celcius");
		
		
	}

}
