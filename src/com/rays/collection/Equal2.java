package com.rays.collection;

public class Equal2 {
	private int id = 0;
	private  String name = null;
	
	public Equal2(int id, String name) {
		this.id =id;
		this.name = name;
		
	}
	public int getId() {
		return id;
		
	}
	public String getName() {
		return name;
		
	}
	@Override 
	public String toString() {
		
		return (" ( "+id + "  "  +  name +" )");
	}	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Equal2)) {
			return false;
		}
		
		Equal2 e =(Equal2) obj;
		boolean b = this.id == e.id && this.name.equals(e.name);
		return b;
	
	}
	@Override
	public int hashCode() {
		String str =id + name;
		return str.hashCode();
	}

}
