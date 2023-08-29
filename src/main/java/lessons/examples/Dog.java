package lessons.examples;

public class Dog {

    String name;
    int age;
    String breed;
    String color;
    int numberOfLegs;

    public Dog (){
        this.numberOfLegs = 4;
    }

    public Dog (int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    void bark() {
        System.out.printf("\nBark! My name is: " + name);
    }

}
