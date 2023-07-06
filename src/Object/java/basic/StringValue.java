package Object.java.basic;

public class StringValue {
	public static void main(String[] args) {
		
		String str = "sie23ghy67tui9bfgt5vd8";
		
				int sum =0;
				for(int i = 0; i<str.length(); i++) {
					
					if(Character.isDigit(str.charAt(i))){
						sum=  sum+ Character.getNumericValue(str.charAt(i));
					}
				}
				
				System.out.println(sum);
				
				
		}
	}



