package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPerson {


	public static void main(String[] args) {
		Person p1  = new Person(1,"vaanya");
		Person p2  = new Person(2,"vanshika");
		
		List list =new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add(100);
		list.add(p1);
		list.add(p2);
		
		//for(int i = 0; i <list.size(); i++) {
		//	System.out.println(list.get(i));
		//}  
		              //////or
		// for(Object object : list) {
		// System.out.println(object);
		// }
		
		//Person p =(Person) list.get(3);
		
		//System.out.println(p.getId());
		//	System.out.println(p.getName());
		//	System.out.println(list);
			
			
		Iterator it = list.iterator();    //use iterator....
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());	
			// Person p =(Person)it.next();
		 

			//System.out.println(p.getId());		
			//System.out.println(p.getName());			
				
	 
						                 ////..........
		 }
	
	 
	} 
	 
	
	}


