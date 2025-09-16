package tcs.practice.array;

public class RearrangeArrayInIncreasingDecreasingOrder {

	public static void main(String[] args) {
	int arr[] = {10,2,3,5,25,96,30,9};
	
	rearrangearray(arr);
	}

	
	public static void rearrangearray(int[]arr) {
		
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		/*for (int num : arr) {
            System.out.print(num + " ");
        }*/
		
		for(int i=0;i<n/2;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=n-1;i>=n/2;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
