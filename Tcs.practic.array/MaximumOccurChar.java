package tcs.practice.array;
import java.util.*;

import java.util.Map.Entry;

public class MaximumOccurChar {

	public static void main(String[] args) {
		
		String str = "apple";
		
		maxoccur(str);
	}

	public static void maxoccur(String str) {
		
		char manoj[]=str.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch:manoj) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		int max=0;
		char ch=' ';
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				ch = entry.getKey();
			}
		}
		System.out.println(ch);
		System.out.println(max);
		
	}
}

