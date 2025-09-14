package tcs.practice.array;

import java.util.*;
import java.util.HashMap;
import java.util.List;

public class NonRepeatingElementInArray {

	public static void main(String[] args) {
	
		int arr[] = {1,2,-1,1,3,1};
		
		nonreapeatingelement(arr);

	}

	private static void nonreapeatingelement(int[] arr) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<Integer>list= new LinkedList<>();
		
		for(int num:arr) {
			if(map.get(num)==1) {
				list.add(num);
			}}
		
		System.out.println(list);
		for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.print(num + " ");
            }
}
}}