package lessons.examples;

import java.util.Scanner;


public class TemperatureConverter {

    public static void main(String[] args){

        double fahrenheit;
        double celsius = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the temperature in Fahrenheit: ");

        fahrenheit = userInput.nextFloat();

        double conv = fahrenheitToCelsius(fahrenheit, celsius);

        System.out.println("This temperature in Celsius is: " + conv);

    }

    public static double fahrenheitToCelsius(double fah, double cel){
        return cel = (fah - 32) * (5.0 / 9.0);
    }

}
