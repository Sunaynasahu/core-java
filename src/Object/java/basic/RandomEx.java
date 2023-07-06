package Object.java.basic;

public class RandomEx {
	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++) {
			int number =((int)(Math.random()*100));
			if(number>1) {
				System.out.println(number);
			}
		}
	}

}
