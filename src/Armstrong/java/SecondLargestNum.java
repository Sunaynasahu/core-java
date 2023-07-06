package Armstrong.java;

public class SecondLargestNum {
	public static void main(String[] args) {
		int[] arr = {15,200, 151,10,30,50,100,2000};
		
		int a =0;
		int b =0;	
		 
		for(int i =0; i<arr.length; i++) {
			if(arr[i]> b) {
				a= b;
				b = arr[i];
			
		}
			if(arr[i] > a && arr[i]< b) {
				a=arr[i];
			}

	}
		System.out.println(a);
		
	}

}
