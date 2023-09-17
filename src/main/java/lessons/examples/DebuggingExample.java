package lessons.examples;

import lessons.animals.Cat;

public class DebuggingExample {

    public static void main(String[] args){

        Cat cat1 = new Cat();
        cat1.setName("Gatalho");
        cat1.setLitterPreference("SleepCats");
        cat1.setAge(3);

        Cat cat2 = new Cat();
        cat2.setName("Gatelho");
        cat1.setLitterPreference("FatCats");
        System.out.println(cat2.getAge());

        Cat[] cats = new Cat[2];

        cats[0] = cat1;
        cats[1] = cat2;


    }



}
