package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// Create an object
		Map<String, Integer> hashMap= new HashMap<>(); 

		//K -> Key -> String
		//V -> Value -> Integer
		hashMap.put("Angie", 33);
		hashMap.put("Steve", 34);
		hashMap.put("John", 35);
		hashMap.put("Angie", 32);
		hashMap.put("Jane", 34);
		hashMap.put("Sweytha", 50);
		hashMap.put(null, 20);
		hashMap.put("Sarah", null);
		hashMap.put("Johnson", null);
		
		System.out.println(hashMap);
		
		for(String key: hashMap.keySet()) {
	System.out.println("Name:"+ key + "Age:"+ hashMap.get(key));
	
		}
		//retrieve the age of John and print it to the console
	System.out.println("Age of John is: "+ hashMap.get("John"));
	
	  //Update a value of existing key
	hash.Map.replace
		
	}
	
	

}












//Major Key Takeaways:
//1. Does it preserve insertion order? No
//2. Does keys allow null vales? yes, max 1 null value (Similar to a set)
//3. Does values allow null values? yes values can consist of null value similar to list
//4. Does keys allow duplicates? If we try to add a key again it overrides  the value rather than creating a new <K, V> PAIR
//5. Does values allow duplicates? YES