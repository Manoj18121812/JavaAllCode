package tcs.practice.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,2,2,3,3,1};
		
		removeduplicate(arr);
	}

	private static void removeduplicate(int[] arr) {
		
		HashSet<Integer> manoj = new HashSet<>();
		
		for(int num :arr) {
			manoj.add(num);
		}
		
		for(int num:manoj) {
			System.out.print(num+" ");
		}
}
	
}
