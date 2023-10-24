package lessons.examples;


import lessons.animals.Cat;

import java.util.ArrayList;
import java.util.List;

public class Streams {

    public static void main(String[] args){

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Marie", 11));
        cats.add(new Cat("Lola", 9));
        cats.add(new Cat("Mel", 7));
        cats.add(new Cat("Nina", 5));

        List<Cat> olderCats = new ArrayList<>();

        olderCats = cats.stream()
                .filter(cat -> cat.getAge() > 5)
                .toList();

        cats.stream()
            .forEach(cat -> cat.meow());

        System.out.println(olderCats);

    }


}
