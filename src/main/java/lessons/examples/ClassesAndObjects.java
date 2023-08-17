package lessons.examples;

import java.sql.SQLOutput;

public class ClassesAndObjects {

    public static void main(String[] args){

//        Dog myDog = new Dog();
//        myDog.name = "Guinho";
//        myDog.age = 3;
//        myDog.breed = "Shi-Tzu";
//        myDog.numberOfLegs = 4;
//        myDog.color = "White";
//
//        myDog.bark();
//
//        Dog yourDog = new Dog();
//        yourDog.name = "Snow";
//
//        yourDog.bark();

        Car myCar = new Car();
        myCar.name = "Jeep Renegade";
        myCar.brand = "Jeep";
        myCar.year = 2022;
        myCar.licensePlate = "WL2112";

        System.out.println("My car's name is: " + myCar.name);
        System.out.println("My car's brand is: " + myCar.brand);
        System.out.println("My car's year is: " + myCar.year);
        System.out.println("My car's License Plate is: " + myCar.licensePlate);
        myCar.start();

    }

}
