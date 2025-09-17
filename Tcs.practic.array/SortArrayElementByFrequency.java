package tcs.practice.array;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class SortArrayElementByFrequency {

	public static void main(String[] args) {
		
		int manoj[]= {2,1,1,6,6,6,6,3,3,3};
		
		sortbyfrequency(manoj);

	}

	private static void sortbyfrequency(int[] manoj) {
		
		HashMap<Integer,Integer>map = new HashMap<>();
		
		for(int num : manoj) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		List<Integer> list= new ArrayList<>();
		
		for(int num :manoj) {
			list.add(num);
		}
		
		
		list.sort((a,b)->{
			
			int freqA= map.get(a);
			int freqB=map.get(b);
			
			if(freqA!=freqB) {
				return Integer.compare(freqB, freqA);
			}else {
				return Integer.compare(a, b);
			}
		});
		System.out.println(list);
}
}