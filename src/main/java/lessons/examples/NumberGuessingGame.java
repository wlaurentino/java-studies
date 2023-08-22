package lessons.examples;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        Random randNumber = new Random();
        int randomNumber = randNumber.nextInt(100) + 1;

        boolean playerGuessedCorrectly = false;

        while (!playerGuessedCorrectly){
        System.out.println("Enter your guess (1-100): ");
        int playerGuess = userInput.nextInt();

        if (playerGuess == randomNumber){
            System.out.println("Correct! You win!");
            playerGuessedCorrectly = true;
        }
        else if (playerGuess > randomNumber) {
            System.out.println("Not yet, the number is lower.");
        }
        else {
            System.out.println("Not yet, the number is higher.");
        }
    }
    }
}