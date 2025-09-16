package tcs.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int [][]pairs= {{1,2},{2,1},{4,5},{3,2},{2,3}};
		
		symmentricpair(pairs);

	}

	

	private static void symmentricpair(int[][] pairs) {
		Map<Integer,Integer>map = new HashMap<>();
		for(int num[]:pairs) {
			int first =num[0];
			int second = num[1];
			if(map.containsKey(second)&& map.get(second)==first) {
				System.out.println("("+first+","+second+")");
			}else {
				map.put(first, second);
			}
		}
	}
}


	