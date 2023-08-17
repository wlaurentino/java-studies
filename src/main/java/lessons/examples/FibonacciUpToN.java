package lessons.examples;

import java.util.Scanner;

//Exercise: Fibonacci Series Up To N
//        Objective: Write a program that generates the Fibonacci sequence up to a given number N.
//
//        Steps:
//
//        Ask the user for a number N.
//        Initialize two integer variables a and b to 0 and 1, respectively. These will be used to generate the Fibonacci sequence.
//        Use a while loop to generate the Fibonacci numbers.
//        Inside the loop:
//        If a is less than or equal to N, print a
//        Calculate the next Fibonacci number by adding a and b.
//        Update the values of a and b so that a takes the value of b and b takes the new Fibonacci number.
//        If the next Fibonacci number exceeds N, exit the loop.

public class FibonacciUpToN {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a Number N: ");
        int N = userInput.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series up to " + N);

        while (a <= N){
            System.out.printf(a + " ");

            int nextFibonacci = a + b;
            a = b;
            b = nextFibonacci;
        }

    }

}
