package tcs.practice.array;

import java.util.HashMap;
import java.util.Map.Entry;

//public class CountFreqencyInArray {

	/*
	    public static void main(String[] args) {
	        int[] arr = {10, 5, 10, 15, 10, 5};
	       

	        countfrequency(arr);
	        
	    }
	       
			public static void countfrequency(int[] arr) {
				
				 int n = arr.length;
				 int visitedarr[] = new int[arr.length];
				 
				 int visited = -1;
				 
				 for(int i=0;i<arr.length;i++) {
					 int count =1;
					 for(int j=i+1;j<arr.length;j++) {
						 
						 if(arr[i]==arr[j]) {
							 count++;
							 visitedarr[j]=visited;
						 }
					 }
					 if(visitedarr[i]!=visited) {
						 visitedarr[i]=count;
					 }
				 }
				 
				 for(int i=0;i<visitedarr.length;i++) {
					 if(visitedarr[i]!=visited) {
						 
					 System.out.println(arr[i]+"="+visitedarr[i]);
				 }
				 }
			}   
			}*/


public class CountFreqencyInArray {

    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};

        countFrequency(arr);
    }

    public static void countFrequency(int []arr) {
    HashMap<Integer , Integer> map = new HashMap<>();
    
    for(int num : arr) {
    	map.put(num, map.getOrDefault(num, 0)+1);
    }
    
    for(int key :map.keySet()) {
    	System.out.println(key+"="+map.get(key));
    }
    }
    }

 