/* Author: @ItsYusufDemir
 * Date: 22.03.2023 16:23
 *
 * Description: Multiplication quiz.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        int multiplication = number1 * number2 * number3;

        System.out.printf("What is %d x %d x %d =?\n", number1, number2, number3);
        int answer = input.nextInt();

        if(answer == multiplication)
            System.out.println("Correct!");
        else
            System.out.println("Wrong! It is " + multiplication + ".");



    }
}
