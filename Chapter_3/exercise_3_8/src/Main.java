/* Author: @ItsYusufDemir
 * Date: 22.03.2023 20:10
 *
 * Description: Sort 3 numbers.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        //We will arrange the numbers so that a < b < c
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        if(b > c) { //Biggest number assigned to c
            int temp = b;
            b = c;
            c = temp;
        }

        if(a > b){ //Fix a and b if there is a problem
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Numbers are sorted as: " + a + " " + b + " " + c);



    }
}
