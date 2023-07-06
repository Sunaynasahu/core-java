package Armstrong.java;

public class Array5 {
	public static void main(String[] args) {
		
		String[] names ={"tina", "priya", "riya"};
		for(int i =0; i< names.length; i++) {
			//for (int j =0; j< names[i].length(); j++) {
				for(int j= names[i].length() -1; j>= 0; j--) {
					
				System.out.print(names[i].charAt(j));
			}
			System.out.print(" ");
			
		}
	}

}
