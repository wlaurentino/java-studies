package lessons.examples;

import lessons.animals.Animal;
import lessons.animals.Cat;
import lessons.animals.Dog;

public class Inheritance {

    public static void main(String[] args){

        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();

        myDog.setName("Guinho");

        Cat myCat = new Cat();
        myCat.meow();
        myCat.eat();


    }

}
