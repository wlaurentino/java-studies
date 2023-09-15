package lessons.examples;

public class Car implements MakeNoise {

    String name;
    String brand;
    int year;
    String licensePlate;

    public void start() {

        System.out.println("Start!");
    }

    @Override
    public void makeNoise() {
        System.out.println("BIP BIP VROM VROM interface noise");
    }
}
