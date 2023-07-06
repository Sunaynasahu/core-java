package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class InterfaceList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add(500);
		//System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		list.add(0 ,"piya");
		System.out.println(list);
		
		list.get(2);
		System.out.println(list.get(2));
		
		list.remove("one");
		System.out.println(list);
		
		//list.set(2," riya");
		//System.out.println(list);
		
		list.indexOf(0);
		System.out.println(list);
		
		list.lastIndexOf(0);
		System.out.println(list);
		
         list.subList(0, 3);
         System.out.println(list);
 		
		
		
		
	}

}
