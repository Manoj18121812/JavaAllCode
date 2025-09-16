package tcs.practice.array;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceElementByRank {

	public static void main(String[] args) {
		
		int manoj[]= {20, 15, 26, 2, 98, 6};

		replaceelement(manoj);
	}

	private static void replaceelement(int[] manoj) {
		
		int  n = manoj.length;
		
		int rahul[] = new int[n];
		int i=0;
		for(int num: manoj) {
			rahul[i++]=num;
		}
		Arrays.sort(rahul);
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int key =1;
		
		for(int num:rahul) {
			if(!map.containsKey(num)) {
				map.put(num, key++);
			}
		}
		
		for(int num : manoj) {
			System.out.print(map.get(num)+" ");
		}
		
		
		
	}

}
