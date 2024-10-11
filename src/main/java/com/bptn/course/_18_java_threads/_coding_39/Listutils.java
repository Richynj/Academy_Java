package com.bptn.course._18_java_threads._coding_39;

import java.util.List;

public class Listutils {
	
    // This method finds the biggest integer in the list.
    // Then increments the integer found by one unit and finally 
    // inserts the new incremented integer into the list.
	
    public static void insertNextId(List<Integer> list) {
        if (list.isEmpty()) {
            return; // Handle empty list scenario
        }

        int max = list.get(0);

        for (int element : list) {
            if (element > max) {
                max = element;
            }
        }

        // Increment the maximum value and add it to the list
        list.add(++max);
        System.out.println("Inserted by: " + Thread.currentThread().getName() + ", " + max);
    }
}
