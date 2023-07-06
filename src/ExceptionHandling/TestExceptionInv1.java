package ExceptionHandling;

public class TestExceptionInv1 {
	

	public static void main(String[] args) {
		String name ="admin";
		try {
		if(name.equals("admi")) {
			System.out.println("valid user....!!!");
			
		}else {
			throw new Invaliduser();
			
		}
	}catch (Exception e) {
		System.out.println(e);
		System.out.println(e.getMessage());
	}
     System.out.println("admin is not valid");
}
}
	
