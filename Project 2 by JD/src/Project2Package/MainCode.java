package Project2Package;

public class MainCode {
 public static void main(String[] args) {
	 int[] arr = {1,0,5,6,3,2,3,7,9,8,4};
	 int sub = 0;
	 
	 for(int i = 0; i < arr.length; ++i) {
		 for(int j = i+1; j < arr.length; ++j) {
			 if(arr[i] > arr[j]) {
				 sub = arr[i];
				 arr[i] = arr[j];
				 arr[j] = sub;
			 }
			
		 }
		 
	 }
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	 
 }
}
