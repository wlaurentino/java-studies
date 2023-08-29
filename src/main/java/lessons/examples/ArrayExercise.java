package lessons.examples;

public class ArrayExercise {

    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5};
        int evenSum = 0;
        int oddProduct = 1;

//        num is a variable that takes on the value of each individual element in the numbers array, one at a time.
//                Inside the loop, for each iteration, num will hold the current element's value from the numbers array.
//                The loop will run as many times as there are elements in the array.
//
//        For the example array int[] numbers = {1, 2, 3, 4, 5};:
//
//        In the first iteration, num will be 1.
//        In the second iteration, num will be 2.
//        In the third iteration, num will be 3.
//        And so on...

        for (int num : numbers){
            if (num % 2 == 0){
                evenSum += num;
            }
            else{
                oddProduct *= num;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Product of odd numbers: " + oddProduct);

    }

}
