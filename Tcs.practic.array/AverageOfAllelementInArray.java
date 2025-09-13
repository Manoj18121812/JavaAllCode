package tcs.practice.array;

public class AverageOfAllelementInArray {

	public static void main(String[] args) {
		int arr[] = {10,2,6,52,96,30,20};
		
		averageofarray(arr);

	}

	private static void averageofarray(int[] arr) {
		
		int avg=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			 temp=arr[i]+temp;
		}
		avg = temp/arr.length;
		System.out.println("Average of array element is : " + avg);
	}

}
