package Armstrong.java;

public class Array2D {
	public static void main(String[] args) {
		
		int[] [] table = new int [10][10];
		 for(int i =1; i<=10; i++) {
			 
		 
			 for(int j =1; j<=10; j++) {
				 
				 table[i-1 ][j-1]= i*j ;
				 
				 
				 //System.out.print(table[i-1][j-1] +" \t ");
				 
			 }
				
			
			   //System.out.println();
		 }
			
		 //System.out.print(table[1][4]);	 
			 for(int[] a : table) {
				 
				 for(int k = 1; k< a.length; k++) {
					 
					 System.out.print(a[k] + " \t ");
					 
				 }
				 System.out.println();
			 }
		 
				 
		 }
	}


