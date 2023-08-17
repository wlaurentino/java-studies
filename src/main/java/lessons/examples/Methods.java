package lessons.examples;

public class Methods {

    public static void main(String[] args){

        int n1 = 8;
        int n2 = 11;
        int total = sum(n1, n2);

        System.out.println("The total is: " + total);
        sayHello();
    }

    private static void sayHello (){
        System.out.println("Hello");
    }
    private static int sum (int number1, int number2){
        return number1 + number2;
    }

}
