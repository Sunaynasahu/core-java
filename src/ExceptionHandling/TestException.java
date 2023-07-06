package ExceptionHandling;

public class TestException {
	public static void main(String[] args) {
		
	try {	
		int a =20;
		System.out.println("a = " + a);
		int b =0;    //throw exception
		System.out.println("b = " + b);
		int c = a/b;
		System.out.println("Divisible =" + c);
		
		String number ="100a";
		int n = Integer.parseInt(number);
	  // System.out.println("Number =" + number);
		
		
	}catch(Exception e) {
		//System.out.println("In catch Block");
		//System.out.println("In catch Block " + e.getMessage());
		e.printStackTrace();
		
	}finally {
		System.out.println("finally Block");
	}
	System.out.println("After catch Block");

}
}
