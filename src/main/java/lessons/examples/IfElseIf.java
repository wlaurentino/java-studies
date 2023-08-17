package lessons.examples;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.printf("Your age is: " + age);

        if (age < 18 ) {
            System.out.println("\nYou can't smoke yet");
        }
        else if (age < 21){
            System.out.println("\nYou can smoke but you can't drink");
        }
        else if (age < 60){
            System.out.printf("\nYou can smoke and drink but you're not a Senior citizen");
        }
        else {
            System.out.println("\nGreat! It's a miracle you're still alive :D");
        }


    }
}
