package Armstrong.java;

public class Args {
	public static void main(String[] args) {
		int count =0;
		for(String string : args) {
			for(int i =0; i< string.length(); i++){
				if(string.charAt(i)== 'g') {
					count++;
					
				}
				
			}System.out.print(count);
			
		}
		
	}

}
