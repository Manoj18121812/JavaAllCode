package tcs.practice.array;

import java.util.Arrays;

public class MergeArrayAndfindMedian {

	public static void main(String[] args) {
		
		int arr[] = {1,2};
		int arr1[]= {3,4};
		
		double result =findmedian(arr,arr1);
		System.out.println(result);

	}

	private static double findmedian(int[] arr, int[] arr1) {
		
		int merged[] = new int[arr.length+arr1.length];
		int i=0;
		for(int num:arr) {
			merged[i++]=num;
		}
		
		for(int num:arr1) {
			merged[i++]=num;
		}
		Arrays.sort(merged);
		int n=merged.length;
		
		if(n%2==1) {
			return merged[n/2];
		}
		else {
			return (merged[n/2-1]+merged[n / 2] )/ 2.0;
		}
	}

}
