package lessons.examples;

public class StringyStuffs {

    public static void main(String[] args){

        String firstName = "William";
        String lastName = "Laurentino";
        String fullName = firstName + " " +  lastName;

        int fullNameLenght = fullName.length();

        System.out.println(fullNameLenght);
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());

    }

}
