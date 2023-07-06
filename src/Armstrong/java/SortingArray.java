package Armstrong.java;

public class SortingArray {
	public static void main(String[] args) {
	
		int[] arr = {2000,1000,100,40,60,80};
		int temp =0;
		for(int i= 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++  ) {
				
				if(arr[i] > arr[j]) {
					temp =arr [i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		for(int k : arr) {
			System.out.println(k);
		}
	
		
	}
	

}
