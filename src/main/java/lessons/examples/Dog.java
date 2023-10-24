package lessons.examples;

import java.util.Objects;

public class Dog implements MakeNoise {

    String name;
    int age;
    private String breed;
    private String color;
    int numberOfLegs;


    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }

        Dog other = (Dog)obj;

        return Objects.equals(this.getName(), other.getName()) && Objects.equals(this.getAge(), other.getAge());

    }

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

    public String toString(){
       return "This is a " + this.age + " years old dog named " + this.name;
    }

    @Override
    public void makeNoise() {
        System.out.println("AU AU interface Noise");
    }
}
