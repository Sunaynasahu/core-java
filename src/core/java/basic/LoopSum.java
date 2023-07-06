package core.java.basic;

public class LoopSum {
	public static void main(String[] args) {
		int sum = 1;
		
		for(int i= 2; i<100; i = i+4) {
			
			System.out.println(i);
			sum = sum + i;
			
		
		System.out.println("sum=" + sum);
		}
		
	}

}