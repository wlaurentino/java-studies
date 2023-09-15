package lessons.examples;

public class InterfacesExample {

    public static void main(String[] args){

        Dog myDog = new Dog();
        Car myCar = new Car();

        makeTheNoise(myDog);
        makeTheNoise(myCar);
    }

    private static void makeTheNoise(MakeNoise makeNoise){
        makeNoise.makeNoise();
    }


}
