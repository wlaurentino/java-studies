package lessons.examples;

import java.util.Scanner;

public class GettingUserInput {

    public static void main(String[] args){
        String name;
        int age;
        float weight;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = userInput.nextLine();
//        System.out.println("Your name is: " + name);

        System.out.println("Please enter your age: ");
        age = userInput.nextInt();
//        System.out.printf("Your age is: " + age);

        System.out.println("Please enter your weight: ");
        weight = userInput.nextFloat();
//        System.out.printf("Your weight is: " + weight);

        System.out.printf("Your name is: " + name + " Your Age is: " + age + " Your weight is: " + weight);


    }

}
