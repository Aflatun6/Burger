package collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        System.out.println(languages.put("Java", "Very cool language"));
        System.out.println(languages.put("Python", "The coolest language"));
        System.out.println(languages.put("C++", "Very very cool language"));
        languages.put("Scala", "Very very very cool language");
        for (String key : languages.keySet()) {
            System.out.println(key + " is " + languages.get(key));
        }
        System.out.println(languages.remove("Java", "Very cool language"));
        for (String key : languages.keySet()) {
            System.out.println(key + " is " + languages.get(key));
        }
    }
}
