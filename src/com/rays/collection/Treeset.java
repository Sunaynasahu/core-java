package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		
	SortedSet set = new TreeSet();
	
	
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
	    set.add("e");
	    set.add("f");
	    
	    for(Object object : set);
	    System.out.println(set.first());
	    System.out.println(set.last());
	    System.out.println(set.headSet("c"));
	    System.out.println(set.tailSet("c"));
	    System.out.println(set.subSet("a" ,"d"));
	    
	}
}