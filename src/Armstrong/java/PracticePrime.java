package Armstrong.java;

public class PracticePrime {
	
	public static void main(String[]args) {
		
		int number = 26;
		int count = 0;
		for(int i=2; i<number; i++) {
			if(number% i==0) {
				count++;
				System.out.println("to number=" +i);
				
			}
		}
		if(count==0) {
			System.out.println("primenumber");
		}else {
			System.out.println("not primenumber");
		}
		
	}
	}


