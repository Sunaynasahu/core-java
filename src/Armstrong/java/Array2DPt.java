package Armstrong.java;

public class Array2DPt {
	public static void main(String[] args) {
		int [][] table = new int [10][10];
		for(int a= 1; a<= 10; a++) {
			for(int b= 1; b<= 10; b++) {
				
				table[a-1][b-1] = a * b;
				
			
			  // System.out.print(table[a-1][b -1] +" \t ");
			}
		
		     // System.out.println();
			
			}	
		
	for(int[] k :  table) {
			
			for(int c= 1; c< k.length; c++) {
				
			
			 System.out.print(k[c] +" \t");
			} 
			  System.out.println();

		}

		
					
	}

}
