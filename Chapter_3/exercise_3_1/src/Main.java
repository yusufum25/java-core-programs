/* Author: @ItsYusufDemir
 * Date: 22.03.2023 16:12
 *
 * Description: Find the real roots of a second order equation.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients of a second order equation: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if(a == 0) {
            System.out.println("Invalid input, give a second order equation!");
            System.exit(0);
        }

        double delta = b * b - 4 * a * c;

        if(delta < 0) {
            System.out.println("No real roots!");
            System.exit(0);
        }

        double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
        double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);

        if(delta == 0){
            System.out.println("One root: " + root1);
        }
        else{
            System.out.println("Root 1: " + root1 + "\nRoot 2: " + root2);
        }

    }
}
