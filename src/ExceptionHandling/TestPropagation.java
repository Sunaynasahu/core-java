package ExceptionHandling;

public class TestPropagation {
	public static void main(String[] args) {
		dad();
		
	}public static void dad() {
		try {
		    mom();
		}catch ( Propagation11 e) {
			// TODO: Auto-generate catch block
			System.out.println(e);
		}
	
	}public static void mom()throws Propagation11 {
		son();
		
	}public static void son() throws Propagation11 {
		throw new  Propagation11 ();
		
		
	}

}
