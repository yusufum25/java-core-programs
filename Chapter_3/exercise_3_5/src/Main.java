/* Author: @ItsYusufDemir
 * Date: 22.03.2023 16:47
 *
 * Description: Find the which day after x days.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Which day is today?\n0 Sunday\n1 Monday\n2 Tuesday\n3 Wednesday\n4 Thursday\n5 Friday\n6 Saturday");
        int today = input.nextInt();

        System.out.println("Enter how many will be passed: ");
        int daysPassed = input.nextInt();

        System.out.print("After " + daysPassed + " days, it will be ");
        switch ((today + daysPassed) % 7){
            case 0: System.out.println("sunday."); break;
            case 1: System.out.println("monday."); break;
            case 2: System.out.println("tuesday."); break;
            case 3: System.out.println("wednesday."); break;
            case 4: System.out.println("thursday."); break;
            case 5: System.out.println("friday."); break;
            case 6: System.out.println("saturday."); break;
        }



    }
}
