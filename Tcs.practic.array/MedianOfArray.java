package tcs.practice.array;

import java.util.Arrays;

public class MedianOfArray {

	public static void main(String[] args) {
		int arr[] = {2,3,5,6,9,4,1,58,35};
		
		medianofarray(arr);

	}

	private static void medianofarray(int[] arr) {
		
		Arrays.sort(arr);
		int n=arr.length;
		if(n%2==0) {
			int ind1 = (n / 2) - 1;
			int ind2 = (n / 2);
			double median =(arr[ind1] + arr[ind2]) / 2;
			System.out.println("Median is :"+median);
		}
		else
		{
			System.out.print("Median is :" + arr[(n / 2)]);
		}
	}
		
	}


