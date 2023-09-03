package lessons.examples;

public class GettersAndSetters {

    public static void main(String[] args){

        Dog myDog = new Dog();
        myDog.setAge(6);
        myDog.setName("Guinho");

        System.out.println(myDog.getAge());
        myDog.bark();

    }

}
