package com.bptn.course._17_java_collections_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap();
		
		linkedHashMap.put("Jane", 24);
		linkedHashMap.put("Angie", 24);
		linkedHashMap.put("Steve", 26);
		linkedHashMap.put("Sweytha", 50);
		linkedHashMap.put(null, 55);
		linkedHashMap.put("Sarah", null);
		linkedHashMap.put("Sweytha", 60);
		
		System.out.println(linkedHashMap);
		
		//Access the value in LinkedHashMap
		System.out.println("Jane's age is"+ LinkedHashMap.get("Jane"));
		
		

	}

}
