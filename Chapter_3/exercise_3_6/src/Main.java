/* Author: @ItsYusufDemir
 * Date: 22.03.2023 19:31
 *
 * Description: Calculate the BMI (Body Mass Index). The user will give weight in pounds, and height in feet and inches.
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Taking Inputs
        System.out.println("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height as 'feet inches' (ex. 5 10): )");
        double feet = input.nextDouble();
        double inches = input.nextDouble();


        //Constants
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_FEET = 0.3048;
        final double METERS_PER_INCHES = 0.0254;

        //Conversions
        double weightInKilogram = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = feet * METERS_PER_FEET + inches * METERS_PER_INCHES;

        double bmi = calculateBmi(weightInKilogram, heightInMeters);

        printBmi(bmi);


    }


    public static double calculateBmi(double weightInKilogram, double heightInMeters) {

        return weightInKilogram / (heightInMeters * heightInMeters);
    }



    public static void printBmi(double bmi){

        System.out.println("BMI is " + bmi);
        if(bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi < 25)
            System.out.println("Normal");
        else if(bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }


}
