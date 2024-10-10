package com.bptn.course._17_java_collections_map;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoopExample {

	 public static void main(String[] args) {
		 
	        Set<String> set = new HashSet<>();
	        set.add("A");
	        set.add("B");
	        set.add("C");

	        // Using a for-each loop
	        for (String element : set) {
	            System.out.println(element);
	        }
	    }
	}



