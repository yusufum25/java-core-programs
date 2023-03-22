/* Author: @ItsYusufDemir
 * Date: 22.03.2023 20:52
 *
 * Description: Multiplication quiz.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.println("What is " + number1 + " * " + number2 + "?");
        int answer = input.nextInt();

        if(answer == number1 * number2) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong! The answer is " + (number1 * number2) + ".");
        }



    }
}
