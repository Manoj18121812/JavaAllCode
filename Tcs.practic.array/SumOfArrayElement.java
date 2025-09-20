package tcs.practice.array;

public class SumOfArrayElement {

	public static void main(String[] args) {
		
		int arr[] = {10,25,63,96,65,24,35};
		
		sumelement(arr);

	}
	
	public static void sumelement(int arr[]) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of array element is :"+ sum);
	}

	
}
