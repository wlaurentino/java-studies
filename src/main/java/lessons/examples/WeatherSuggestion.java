package lessons.examples;

import java.util.Scanner;

public class WeatherSuggestion {

//    Exercise: Weather Suggestion
//    Imagine you're building a small application that suggests activities based on the weather. Given the following conditions:
//
//    isSunny: A boolean value that represents if it's sunny outside.
//    isRainy: A boolean value that represents if it's raining outside.
//    temperature: An integer value that represents the current temperature in degrees Celsius.
//    Write a Java program that suggests activities based on the following criteria:
//
//    If it's sunny and the temperature is above 25°C, suggest "It's a perfect day for the beach!"
//    If it's rainy and the temperature is below 15°C, suggest "Stay indoors and have some hot chocolate!"
//    If it's sunny but the temperature is below 15°C, suggest "It's a nice day for a brisk walk!"
//    In any other case, suggest "It's a regular day."

    public static void  main(String[] args){

        int temperature;

        Scanner userInput = new Scanner(System.in);

        System.out.println("How is the weather today? Type 'S' for Sunny or 'R' for Rainy" );
        String weather = userInput.next();
        System.out.println("What is the temperature in Celsius today?");
        temperature = userInput.nextInt();

        if(weather.equals("S") && temperature > 25){
            System.out.println("It's a perfect day for the beach!");
        } else if (weather.equals("R") && temperature < 15) {
            System.out.println("Stay indoors and have some hot chocolate!");
        } else if (weather.equals("S") && temperature < 15) {
            System.out.println("It's a nice day for a brisk walk!");
        }
        else {
            System.out.println("It's a regular day.");
        }

    }

}
