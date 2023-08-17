package lessons.examples;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args){

        String name;
        float weight;
        float height;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = userInput.nextLine();

        System.out.println("Enter your weight: ");
        weight = userInput.nextFloat();

        System.out.println("Enter your height: ");
        height = userInput.nextFloat();

        System.out.println(name + " 's Body Mass Index is: " + (weight / (height * height)));

    }
}
