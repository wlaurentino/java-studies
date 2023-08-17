package lessons.examples;

//Challenge: Days of the Week
//
//        Write a Java program that takes a number between 1 and 7 as input, where each number represents a day of the week, starting from Monday (1) to Sunday (7).
//        The program should then display the name of the day and a simple activity suggestion for that day.
//
//        Requirements:
//
//        Use If/Else If/Else statements to determine the day of the week.
//        For each day, give a simple activity suggestion. For example:
//        Monday (1): "Start your week with a good workout!"
//        Sunday (7): "Relax and enjoy some leisure time!"

import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that represents a day of the week, starting from Monday (1) to Sunday (7)");
        int weekDay = input.nextInt();

        if(weekDay == 1){
            System.out.println("\"Monday - start your week with a good workout!\"");
        }
        else if(weekDay == 2){
            System.out.println("Tuesday - don't forget to keep the diet");
        }
        else if(weekDay == 3){
            System.out.println("Wednesday - half the week is already gone");
        }
        else if(weekDay == 4){
            System.out.println("Thursday - you're doing good, keep going");
        }
        else if(weekDay == 5){
            System.out.println("Friday - Time for a movie night!");
        }
        else if(weekDay == 6){
            System.out.println("Saturday - spend some time with your family and friends");
        }
        else if(weekDay == 7){
            System.out.println("Relax and enjoy some leisure time!");
        }
        else{
            System.out.println("Please enter a number starting from Monday (1) to Sunday (7).");
        }

    }

}
