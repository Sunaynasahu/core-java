package core.java.basic;

public class String4 {
	public static void main(String[] args) {
		String name ="core java";
		
		int count =0;
		for(int i =0; i < name.length(); i++) {
			if(name.charAt(i) =='a') {
				count++;
				
			}
			 System.out.println("count =" +count);
			 
			 System.out.println(name.charAt(i));
		
		}
		
		     
		
	}

}
