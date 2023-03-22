/* Author: @ItsYusufDemir
 * Date: 22.03.2023 16:32
 *
 * Description: Solve a 2x2 matrix by Cramer's rule. If ad - bc = 0, then system has no solution
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first equation's coefficients: a,b and c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.println("Enter the second equation's coefficients: d, e, and f");
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        if(a * d - b * c == 0){
            System.out.println("System has no solution!");
        }
        else{
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);

            System.out.println("x is: " + x + "\ny is: " + y);
        }



    }
}
