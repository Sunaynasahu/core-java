package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestEqual2 {
	public static void main(String[] args) {
		Equal2 e1  = new Equal2(1,"vaanya");
		Equal2 e2  = new Equal2(2,"vanshika");
		Equal2 e3  = new Equal2(2,"vanshika");
		
		List list =new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add(100);
		list.add(e1 );
		list.add(e2);
		list.add(e3);

		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
	}

}
