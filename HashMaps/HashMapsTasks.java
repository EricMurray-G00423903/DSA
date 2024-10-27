package HashMaps;

import java.util.HashMap;

public class HashMapsTasks {

    public static void main(String[] args) {

        // Task 1 - Create a HashMap and Add some K,V pairs and print
        HashMap<String, Integer> studentScores = new HashMap<>();   // Declaration

        studentScores.put("Nora Keavney", 100); //Use .put to add a K,V pair
        studentScores.put("Amy McEvoy", 0);
        studentScores.put("Fionn", -100);

        System.out.println(studentScores);  //HashMaps the Order is not guaranteed - Memory is not stored contigiously

        // Task 2 - use .get() and .containsKey()
        System.out.println(studentScores.get("Fionn")); //.get() returns the VALUE associated with the KEY passed in the () - This should return -100
        System.out.println(studentScores.containsKey("Amy McEvoy")); //Returns true if the KEY exists in the HashMap
        System.out.println(studentScores.containsValue(100)); //Returns true if the VALUE exists

        // Task 3 - Iterate through all the K,V pairs in the HashMap, then use entrySet() & keySet()
        studentScores.forEach( (k, v) -> { System.out.println("Key -> " + k + " | Value -> " + v); } );

        System.out.println("Using entrySet() -> " + studentScores.entrySet());  //Returns a view of all the K,V pairs
        System.out.println("Using keySet() -> " + studentScores.keySet());  //Returns all the Keys

        //Task 4 - use .remove() & then try .get to see how it handles null
        studentScores.remove("Fionn");
        System.out.println("Using .get() -> on removed Key -> " + studentScores.get("Fionn"));

        
    }

    
}
