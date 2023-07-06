package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student (2,"jiya", 2500));
		list.add(new Student (1,"priyanka", 1000));
		list.add(new Student (3,"sapna", 3000));
		list.add(new Student (4,"Amisha", 5500));
		//Collections.sort(list);
		
		Collections.sort( list,OrderById());
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object object =it.next();
			System.out.println(object);
		}
	}

	private static Comparator OrderById() {
		// TODO Auto-generated method stub
		return null;
	}



}
