/* Author: @ItsYusufDemir
 * Date: 22.03.2023 20:27
 *
 * Description: Enter the first 9 digits to find ISBN-10 number.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbn9digits = input.nextInt();

        findISBN10(isbn9digits);
    }


    public static void findISBN10(int isbn9digits){

        int lastDigit = 0;

        int temp = isbn9digits;

        for(int i = 9; i > 0; i--){
            lastDigit += (temp % 10) * i;  //Multiply the current last digit with its index
            temp /= 10; //Get rid of the current last digit
        }

        lastDigit = lastDigit % 11;

        for(int i = 100000000; i > 1; i = i / 10){ //Printing the leading zeros
            if(isbn9digits < i)
                System.out.print("0");
        }

        System.out.print(isbn9digits);
        System.out.print(lastDigit == 10 ? "X" : lastDigit);

    }
}
