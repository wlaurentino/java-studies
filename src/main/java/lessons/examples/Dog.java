package lessons.examples;

public class Dog implements MakeNoise {

    private String name;
    private int age;
    private String breed;
    private String color;
    int numberOfLegs;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog (){
        this.numberOfLegs = 4;
    }

    public Dog (int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public void bark() {
        System.out.printf("\nBark! My name is: " + name);
    }

    @Override
    public void makeNoise() {
        System.out.println("AU AU interface Noise");
    }
}
