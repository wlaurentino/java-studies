package lessons.examples;

public class Constructors {

    public static void main(String[] args){

        Dog myDog = new Dog();
        Dog yourDog = new Dog(3);

        System.out.println(myDog.numberOfLegs);
        System.out.println(yourDog.numberOfLegs);

    }

}
