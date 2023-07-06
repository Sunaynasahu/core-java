package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("sakshi");
		list.add("kajal");
		list.add("amita");
		list.add(100);
		
		Iterator it = list.iterator();
		list.add("200");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
