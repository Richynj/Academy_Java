package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import  java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		
		//Create an object of HashSet

		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple"); //It allows Duplicates ? NO
		hashSet.add(null);    // It allows null values? Yes
		
		System.out.println("The Hashset of fruits:"+ hashSet);
		
		
	}

}






//Major Key Takeaways:

//1.Insertion Order
//It allows null values? It Allows max 1 null value
//3. It allows duplicates?
//4. Underlying implementation-
//5. Is  a Hashset indexed?

