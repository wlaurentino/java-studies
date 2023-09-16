package lessons.examples;

public class ExceptionHandling {

    public static void main(String[] args){

        try{
            int myInt = Integer.parseInt("Trying to make transform a String into int it will blow an exception without this Try Catch block");
        }
        catch (NumberFormatException nfe){
            System.out.println("The program handle the exception");
        }
        finally {
            System.out.println("Finally always run no matter there is an exception or not");
        }

        System.out.println("End of program here");
    }

}
