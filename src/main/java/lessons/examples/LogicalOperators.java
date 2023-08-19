package lessons.examples;

public class LogicalOperators {
    public static void  main(String[] args){
        int age1 = 22;
        int age2 = 21;
        int age3 = 17;

        if(age1 >= 17 || age2 >= 17){
            System.out.println("The group can go to the movies");
        }
        else{
            System.out.println("The group can't go to the movies :(");
        }

        if (age1 >= 21 && (age2 >= 21 && age3 >= 21)) {
            System.out.println("The group can go to the bar");
        }
        else{
                System.out.println("The group can't go to the bar :(");
        }
    }
}
