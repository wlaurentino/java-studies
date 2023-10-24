package lessons.animals;

public class Cat extends Animal{



    private String litterPreference;

    public Cat(String name, int age) {
        super();
        setName(name);
        setAge(age);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }


    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public void meow(){
        System.out.println("MIAU !! My name is: " + getName());
    }

    @Override
    public void eat(){
        System.out.println("cat NHAMI NHAMI !!");
    }

    public void eat(int numberOfBites){
        for (int i = 0; i < numberOfBites; i++){
            System.out.println("cat NHOMI !!");
            eat();
        }

    }


}
