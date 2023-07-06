package Armstrong.java;

public class Array3 {
	public static void main(String[] args) {
		 String[] name = {"tina", "priya", "riya"};
		 int count = 0;
		 for(char c ='a'; c <= 'z'; c++) {
			 
			 for(String s : name) {
				 for (int i = 0; i< s.length(); i++) {
					 if(s.charAt(i)== c) {
						 
						count++;
						
					 }
				 }
				
				 
			 }
			 System.out.println(c +" = " + count);
			 count = 0;
			 
		 }
		
	}
	

}
