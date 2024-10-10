package com.bptn.course._17_java_collections_map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterationWithIterator {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        // Using an Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}	


	


