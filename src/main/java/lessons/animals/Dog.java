package lessons.animals;

public class Dog extends Animal{
    private int walkDistancePreference;

    public int getWalkDistancePreference() {
        return walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }

    public void bark(){
        System.out.println("AU !! AU !!");
    }

    public void eat(){
        System.out.println("dog NHAMI NHAMI");
    }

}
