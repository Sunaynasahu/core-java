package Armstrong.java;

public class Array4 {
	public static void main(String[] args) {
		
		 String[] name = {"Tina", "Priya", "Riya"};
		 int count = 0;
		 
		 for(String s : name) {
			 for (int i = 0; i< s.length(); i++) {
				 if(s.charAt(i)== 'a') {
					 
					count++;
					
				 }
			 }
			 System.out.println( "count ="+ count);
			 
		 }

		
	}

}
