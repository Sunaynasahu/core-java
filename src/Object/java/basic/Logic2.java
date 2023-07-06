package Object.java.basic;

public class Logic2 {
	public static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
 public static int max (int c, int d) {
	if(c>d) {
		return c;
		
		
	}else 
		return d;
}
 
 
 public static void printtable(int n) {
	 for(int i=1; i<=10; i++) {
		 for(int j=1; j<=n; j++) {
		 
			 System.out.print(i*j + " \t ");
			 
			
		 }	System.out.println();
	 }
	
}
}

