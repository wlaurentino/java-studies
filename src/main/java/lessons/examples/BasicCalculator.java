package lessons.examples;

//Exercise: Basic Calculator
//        Objective: Create a basic calculator that can perform addition, subtraction, multiplication, and division using methods.
//        Instructions:
//        Create a class named BasicCalculator.
//        Inside the BasicCalculator class, create the following static methods:
//public static int add(int a, int b): This method should return the sum of a and b.
//public static int subtract(int a, int b): This method should return the difference of a and b.
//public static int multiply(int a, int b): This method should return the product of a and b.
//public static int divide(int a, int b): This method should return the quotient of a divided by b. If b is zero, print an error message and return 0.
//        Create a main method to test the BasicCalculator class. In this method:
//        Test each operation and print the results.
public class BasicCalculator {

    public static void main(String[] args){

        int N1 = 10;
        int N2 = 2;
        int add = add(N1, N2);
        int sub = substract(N1, N2);
        int mult = multiply(N1, N2);
        int div = divide(N1, N2);
        System.out.println("The sum is: " + add);
        System.out.println("The substraction is: " + sub);
        System.out.println("The multiplication is: " + mult);
        System.out.println("The division is: " + div);

    }
    public static int add(int A, int B){
        return A + B;
    }

    public static int substract(int A, int B){
        return A - B;
    }

    public static int multiply(int A, int B){
        return A * B;
    }

    public static int divide(int A, int B){
        return A / B;
    }

}
