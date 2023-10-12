package lessons.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args){

        Set<String> name = new HashSet<>();

        name.add("João");
        name.add("Gabriel");
        name.add("Kraudio");
        name.add("Edson");

        System.out.println(name);

        name.remove("Kraudio");

        System.out.println(name);

        String[] nameArray = name.toArray(new String[0]);

        String[] cars = {"Toyota", "Toyota", "Honda", "Tesla", "Jeep"};
        Set<String> carsSet = new HashSet<>(Arrays.asList(cars));
        System.out.println(carsSet);

    }

}
