package hometask;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Question 1:
        Map<String, Integer> students = new Map<String, Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(String key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }
        };

        Map<String, Integer> all = new HashMap<>();

        /*
        Question2 : Explain the primary use cases for using a Map.
            1. Key and value principle
            2. Uniqueness of keys
            3. no duplicate values restrictions
            4. Key based opertions
            5. Iterating over the key / value
         */


        //Question 3:
        //Provide at least three examples where a Map can be more appropriate than other data structures.
            //Example 1:
        // Using Map for unique identifier to object mapping
        Map<String, Person> personMap = new HashMap<>();
        personMap.put("ID123", new Person("Alice"));
        personMap.put("ID456", new Person("Bob"));

        // Retrieving a person based on a unique identifier
        Person alice = personMap.get("ID123");





        //Example 2:
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Retrieving the frequency of a specific word
        int appleCount = wordCountMap.getOrDefault("apple", 0);





        //Example 3:
        // Using Map for configuration settings
        Map<String, String> configSettings = new HashMap<>();
        configSettings.put("database.url", "jdbc:mysql://localhost:3306/mydb");
        configSettings.put("server.port", "8080");
        configSettings.put("log.level", "INFO");

        // Retrieving the database URL from configuration settings
        String databaseUrl = configSettings.get("database.url");


    }
}
