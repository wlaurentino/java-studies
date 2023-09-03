package lessons.animals;

public class Cat extends Animal{
    private String litterPreference;

    public void meow(){
        System.out.println("MIAU !!");
    }

    public void eat(){
        System.out.println("cat NHAMI NHAMI !!");
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }
}
