package lessons.examples;

import java.util.Scanner;

public class WeatherSuggestion {

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
