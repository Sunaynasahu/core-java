package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add (new Employee (2 , "suman" , 10000));
		list.add (new Employee (5 , "Amisha" , 2000));
		list.add (new Employee (1, "Arti" , 3000));
		list.add (new Employee (3, "khushali" , 5000));
		list.add(new Employee (3, "sanjana" , 1000));
		list.add (new Employee (4, "Priya" , 4500));
		
		Collections.sort(list);
		Iterator it = list.iterator();    //use iterator....
		 
		 while(it.hasNext()) {
		Object object	 = it.next();
			 System.out.println(object);	
		 }
	}

}
