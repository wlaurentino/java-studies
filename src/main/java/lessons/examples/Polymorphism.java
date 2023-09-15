package lessons.examples;

import lessons.animals.Animal;
import lessons.animals.Cat;
import lessons.animals.Dog;

public class Polymorphism {

    public static void main(String[] args){

        Animal myAnimal = new Animal();

        Dog myDog = new Dog();

        Cat myCat = new Cat();
        myCat.eat(3);
    }

}
