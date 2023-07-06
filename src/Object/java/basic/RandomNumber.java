package Object.java.basic;

public class RandomNumber {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			int number =((int)(Math.random()*1000));
			if(number>100) {
				
				System.out.println(number);
			
			}
		}
	}

}
