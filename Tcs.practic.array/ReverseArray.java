package tcs.practice.array;

public class ReverseArray {

	public static void main(String[] args) {
	
		int arr[]= {12,14,52,63,2,3};
		
		reversearray(arr);

	}

	private static void reversearray(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
