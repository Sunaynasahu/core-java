package Armstrong.java;

public class Array6 {
	public static void main(String[] args) {
		
		int[] tables = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		int number =24;
		for(int i =0; i<tables.length; i++) {
			if(tables[i]== number) {
				System.out.println("Index = " + i + " value = " +tables[i]);
				
			}
		}
		
	}

}
