package Armstrong.java;

public class TriangleShape1 {
	public static void main(String[] args) {
		int number = 7;
	
		for(int i =1; i<=number; i++) {
			for(int j = number; j>=i; j--) {
				
				System.out.print(" ");
			}
			for(int k =1; k<=i; k++) {
				System.out.print("  *  ");

				System.out.print("  ");

				
			}
			System.out.println();
		}
	}

}
