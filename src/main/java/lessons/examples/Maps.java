package lessons.examples;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String args[]) {

        Map<Integer, String> familyMembers = new HashMap<>();

        familyMembers.put(0000, "Family Members");
        familyMembers.put(1111, "Will");
        familyMembers.put(2222, "Ale");
        familyMembers.put(3333, "Malu");

        System.out.println(familyMembers);

        for (Integer familyID : familyMembers.keySet()) {
            System.out.println(familyID);
        }

        for (String familyValues : familyMembers.values()) {
            System.out.println(familyValues);
        }


    }

}
