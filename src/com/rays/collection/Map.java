package com.rays.collection;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Sachin tendulkar", 100);
		m.put("yuvraj", 60);
		m.put("virat", 50);
		m.put("Sourav", 0);
		m.put("rahul", 40);
		m.put("Extras", 28);
		m.put("Total", 278);
		System.out.println(m.entrySet());
		System.out.println(m.size());
	}

}
