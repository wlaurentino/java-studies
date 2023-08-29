package lessons.examples;

public class Arrays {
    public static void main(String[] args){

        String[] cars =  {"Jeep", "Toyota", "Ford", "Tesla"};
//        [0], [1], [2], [3]

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

//      the "for" below just goes through each element of the array in order before each version of the loop
//      this one avois the possibility of running into an array index out of bounds excepts if you code it wrong
        for (String car : cars){
            System.out.println(car);
        }

    }

}
