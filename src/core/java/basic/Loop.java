package core.java.basic;

public class Loop {
	public static void main(String[] args) {
		
		for (int i = 1; i<8; i++) {
			
			System.out.println("Hello");
			
		}
		for (int i = 1; i<8; i= i+2) {
			
			System.out.println(i);
		}
		for(int i = 0; i<11; i = i+3) {
			
			System.out.println(i);
		}
		int sum = 0;
		for(int i = 1; i<10; i++) {
			
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum = " + sum);
	}

}
