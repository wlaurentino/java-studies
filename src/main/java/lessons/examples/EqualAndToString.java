package lessons.examples;

public class EqualAndToString {

    public static void main(String[] args){

        Dog myDog = new Dog();
        myDog.setName("Argos");
        myDog.setAge(3);

        Dog yourDog = new Dog();
        yourDog.setName("Argos");
        yourDog.setAge(3);

        if(myDog.equals(yourDog)){
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are NOT equal");
        }


        System.out.println(myDog);


    }


}
