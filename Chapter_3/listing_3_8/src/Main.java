/* Author: @ItsYusufDemir
 * Date: 22.03.2023 15:42
 *
 * Description: Make a lottery. User will give number from 0 to 99.
 * If user finds the exact number --->$10,000
 * If user finds both digits but not in order --->$3,000
 * If user finds one of the digit --->$1,000
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ([0,99]: ");
        int number = input.nextInt();

        int digit2 = number % 10;
        int digit1 = number / 10;

        int randomNumber = (int)(Math.random() * 100);

        int correctDigit2 = randomNumber % 10;
        int correctDigit1 = randomNumber / 10;

        if(digit1 == correctDigit1 && digit2 == correctDigit2){
            System.out.println("Congratulations! You won $10,000. The number was " + randomNumber);
        }
        else if(digit1 == correctDigit2 && digit2 == correctDigit1){
            System.out.println("Congratulations! You won $3,000. The number was " + randomNumber);
        }
        else if(digit1 == correctDigit2 || digit2 == correctDigit1 || digit1 == correctDigit1 || digit2 == correctDigit2){
            System.out.println("Congratulations! You won $1,000. The number was " + randomNumber);
        }
        else{
            System.out.println("The number was " + randomNumber);
        }


    }

}
