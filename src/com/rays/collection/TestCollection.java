package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
public static void main(String[] args) {
	
	Collection list =new ArrayList();
	
	list.add("one");
	list.add("100");
	list.add("two");
	System.out.println(list);
	                              //Add new Collection............
	
	Collection c = new ArrayList();
	c.add("three");
	c.add(700);
	c.add("four");
	                
	System.out.println(c);
	
 list.addAll(c); //.....addAll(o).....add a new elements 
	System.out.println(list);
	
	
	//list.clear();  //......clear( ).......clear all collection
	//System.out.println(c);
	
   list.contains(100); //......contains(o).....membership checking
   System.out.println(list.contains(100));
 
	list.containsAll(c);//......inclusion checking....
	System.out.println(c);
	
	list.isEmpty();//.........Empty....whether is empty..
	System.out.println();

	list.remove(700);//........remove an element....
	System.out.println(list);
	
   list.removeAll(c);//......remove a collection....
   System.out.println(list);
 
     list.retainAll(c);//......keep the element
    System.out.println(list);
  
//  list.size();//.......the number of elements.....
//  System.out.println(list.size());

	
}
}
