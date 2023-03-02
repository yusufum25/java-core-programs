/* Author: @ItsYusufDemir
 * Date: 2 Mar 2023 18:21:21
 * 
 * Description: Calculate the middle point of two points.
 */
package exercise_2_18;

public class CalculateMiddlePoint {

	public static void main(String args[]) {
		
		int x1 = 0; int y1 = 0;
		int x2 = 2; int y2 = 1;
		
		int x3 = 1; int y3 = 4;
		int x4 = 4; int y4 = 2;
		
		int x5 = 2; int y5 = 7;
		int x6 = 6; int y6 = 3;
		
		int x7 = 3; int y7 = 9;
		int x8 = 10; int y8 = 5;
		
		int x9 = 4; int y9 = 11;
		int x10 = 12; int y10 = 7;
		
		System.out.println("   a        b      Middle Point");
		
		System.out.println("("+ x1 + ", " + y1 + ")     (" + x2 + ", " + y2 + ")     (" +
		(x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
		
		System.out.println("("+ x3 + ", " + y3 + ")     (" + x4 + ", " + y4 + ")     (" +
		(x3 + x4) / 2.0 + ", " + (y3 + y4) / 2.0 + ")");
		
		System.out.println("("+ x5 + ", " + y5 + ")     (" + x6 + ", " + y6 + ")     (" +
		(x5 + x6) / 2.0 + ", " + (y5 + y6) / 2.0 + ")");
		
		System.out.println("("+ x7 + ", " + y7 + ")     (" + x8 + ", " + y8 + ")    (" +
		(x7 + x8) / 2.0 + ", " + (y7 + y8) / 2.0 + ")");
		
		System.out.println("("+ x9 + ", " + y9 + ")    (" + x10 + ", " + y10 + ")    (" +
		(x9 + x10) / 2.0 + ", " + (y9 + y10) / 2.0 + ")");
	}
}
