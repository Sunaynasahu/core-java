package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	public static void main(String[] args) {
		List <String>list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("one");
		list.add("tiya");
		list.add("sapna");
		list.add("ankita");
		
		//list.stream().sorted().forEach(e->{
		//	System.out.println(e);
		//});
		//list.stream().distinct().sorted().forEach(e->{
			
		//	System.out.println(e);
		//});
		list.stream().filter(e ->e.startsWith("t")).map(e -> e.toUpperCase()).sorted().distinct().forEach(e->{          //use of <String>
			
			System.out.println(e);
		});
	}

}
