package Armstrong.java;

public class Notearray {
	public static void main(String[] args) {
		
		int amt =3525;
		 int count =0;
		 int[] note = {2000,1000,500,100,50,20,10,5};
		 int r= 0;
		 for(int i = 0; i< note.length; i++) {
			 count = amt/ note[i];
			 
			 
		 if (count> 0) {
			 
						 
		 
		 }
		 System.out.println(note[i] + "  =  " + count); 

		 
		r = amt % note[i];
		
		amt = r;
		 
	}
		 }

}
