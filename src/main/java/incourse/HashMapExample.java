package incourse;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        //Retrieving values
        System.out.println("Alice's score: " + studentScores.get("Alice"));

        //Iterating through the entries
        for(Map.Entry<String, Integer> entry: studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Checking if a key exists
        if(studentScores.containsKey("Alice")) {
            System.out.println("Alice's score exists!");
        }

        //remove
        studentScores.remove("Alice");
        System.out.println("Hash Map after removing: " + studentScores);

    }
}
