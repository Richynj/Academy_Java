package com.bptn.course._17_java_collections_map;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        // Create a HashMap object called numbers
        HashMap<Integer, String> numbers = new HashMap<>();

        // Add key-value pairs to the map
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");

        // Print out the map
        System.out.println("Initial Map:");
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Remove the value whose key is 7
        numbers.remove(7);

        // Add key-value pair for eleven
        numbers.put(11, "eleven");

        // Print out the updated map
        System.out.println("\nUpdated Map:");
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

