package tcs.practice.array;

import java.util.Scanner;

public class RotateArrayByKElement {

	public static void main(String[] args) {
	int arr[] = {4,2,5,8,6,2,3};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the k element");
	int k =sc.nextInt();
	int m=k;
	
	
	rotatearray(arr,k,m);
	}

	public static void rotatearray(int arr[],int k,int m) {
		
		
		for(int i=k;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		if(k==m) {
			for(int i=0;i<k;i++) {
				System.out.print(arr[i]+" ");
			}
		}
				
			}
	
	
	/*public class ArrayShift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size :");
		int size=sc.nextInt();
		System.out.println("Enter the value of k :");
		int k=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if((i+k)<arr.length)
			{
				System.out.print(arr[i+k]+",");
			}
			else if((i+k)>=arr.length)
			{
				int m=i+k;
				System.out.print(arr[m-arr.length]+",");
			}

		}
	}

}*/
	
	
	/*
	 * public static int[] rotateArray(int[] arr, int k) {
    int n = arr.length;
    k = k % n;
    int[] result = new int[n];
    int index = 0;

    for (int i = k; i < n; i++) {
        result[index++] = arr[i];
    }
    for (int i = 0; i < k; i++) {
        result[index++] = arr[i];
    }
    return result;
}
*/
	}

