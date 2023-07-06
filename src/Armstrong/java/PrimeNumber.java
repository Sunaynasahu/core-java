package Armstrong.java;

public class PrimeNumber{
	public static void main(String[] args) {
		
		int number = 11;
		 int count = 0;
		 for(int i=2; i<number; i++) {
			 if(number %i == 0) {
				 count++;
				System.out.println("wo numner="+i);
				
				 
			 }
		 }
		
		if(count == 0) {
			System.out.println("primenumber");
			
		}else {
			System.out.println("not primenumber");
		}
	}
	

}
