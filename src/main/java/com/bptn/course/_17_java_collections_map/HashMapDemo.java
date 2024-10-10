package com.bptn.course._17_java_collections_map;

//Import the necessary classes from the java.util package
import java.util.HashMap;

public class HashMapDemo {

 public static void main(String[] args) {
     // Create a HashMap object named people
     HashMap<String, Integer> people = new HashMap<>();

     // Add key-value pairs to the map
     people.put("Angie", 33);
     people.put("Steve", 30);
     people.put("John", 32);

     // Use a for loop to iterate over the keys and print out the key-value pairs
     for (String name : people.keySet()) {
         System.out.println("Name: " + name + ", Age: " + people.get(name));
     }
 }
}

