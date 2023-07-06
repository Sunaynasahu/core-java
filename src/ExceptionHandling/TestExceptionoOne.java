package ExceptionHandling;

public class TestExceptionoOne {
	public static void main(String[] args) {
		try {
			//String n ="100";
			String name = "priya";
			//int n1 = Integer.parseInt(n);
			System.out.println(name.charAt(9));
			
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException =" + e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException =" +  e.getMessage());
			
		}catch(Exception e) {
			System.out.println("Exception is =" + e);
		}finally {
			System.out.println("Exception Mechanism or syntax..!!");
		}
	}

}
