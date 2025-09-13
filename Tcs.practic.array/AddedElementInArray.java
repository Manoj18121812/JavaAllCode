package tcs.practice.array;

import java.util.ArrayList;

public class AddedElementInArray {

	public static void main(String[] args) {
		int arr[] = {2,3,4,6,7,8};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int num:arr) {
			list.add(num);
		}
		
		
		addelementinstart(list,1);
		addelementinmid(list,5);
		addelementinend(list,9);
		
		System.out.println(list);
		
	}

	private static void addelementinmid(ArrayList<Integer> list,int val) {
		list.add(4, val);
	}

	private static void addelementinend(ArrayList<Integer> list,int val) {
	list.add(val);
		
	}

	private static void addelementinstart(ArrayList<Integer> list,int val) {
		list.add(0, val);
		
	}
}
