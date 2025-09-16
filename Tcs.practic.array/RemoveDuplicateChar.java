package tcs.practice.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String str = "cbacdcbc";
		
		removeduplicate(str);
	}

	private static void removeduplicate(String str) {
		
		Set<Character>set = new LinkedHashSet<>();
		
		char rahul[]=str.toCharArray();
		
		for(char ch:rahul) {
			set.add(ch);
		}
		
		for(char ch:set) {
			System.out.print(ch+"");
		}
		
		System.out.println();
		
		
		StringBuilder result = new StringBuilder();
		
		for(char ch :set) {
			result.append(ch);
			
		}
		
		System.out.println(result.toString());
	}

}
