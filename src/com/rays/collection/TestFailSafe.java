package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {
		Vector list = new Vector();
		list.add("one");
		list.add("sakshi");
		list.add("kajal");
		list.add("amita");
		list.add(100);
		
		Enumeration it = list.elements();
		
		list.add("200");
		while(it.hasMoreElements()) {
			System.out.println(it.nextElement());
		}
	}

}
