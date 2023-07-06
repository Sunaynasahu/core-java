package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(100);
		set.add("two hundred three");
		set.add(650);
		
		System.out.println(set);
		for(Object object : set);
		System.out.println("Object");
		
	}

}
