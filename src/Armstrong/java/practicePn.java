package Armstrong.java;

public class practicePn {
	public static void main(String[]args) {
		int number =11;
		
		int count =0;
		
		for(int j =3; j <=100; j++) {
			
			for(int i = 1; i<j; j++) {
					if(j %i==0) {
					
		          count++;
		          
				}
			}
		
			     if(count ==0) {
			    	 
			    
			     System.out.println("primenumber" +j);

		}else 
			System.out.println( "not primenumber" +number);
			
			        count++;
		     
			     
		}
	}
			     
	}


