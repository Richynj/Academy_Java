package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import  java.util.Set;

public class LinkedHashExample {

	public static void main(String[] args) {
		//Create LinkedHashSet object
		Set<String> LinkedHashSet = new LinkedHashSet<>();
		
		LinkedHashSet.add("banana");
		LinkedHashSet.add("apple");
		LinkedHashSet.add("mango");
		LinkedHashSet.add("cherry");
		
		LinkedHashSet.add("bananan");// It allows duplicates ?
		
		LinkedHashSet.add(null);
		
		System.out.println("The LinkedHashSet is:"+ LinkedHashSet);
		

	}

}


//Major Key Takeaways:

//1.Insertion Order
//It allows null values? It Allows max 1 null value
//3. It allows duplicates?
//4. Underlying implementation-
//5. Is  a Hashset indexed?