package tcs.practice.array;

import java.util.HashMap;
import java.util.Map;

public class SymmentricPairInArray {

	public static void main(String[] args) {
		
		int [][]pairs= {{1,2},{2,1},{4,5},{3,2},{2,3}};
		
		symmentricpair(pairs);
	}

	private static void symmentricpair(int[][] pairs) {
		 
        HashMap<Integer,Integer> map = new HashMap<>();
        
       for(int pair[] :pairs) {
    	   int first=pair[0];
    	   int second=pair[1];
    	   
    	   if(map.containsKey(second)&& map.get(second)==first) {
    		  System.out.println("("+first+","+second+")"); 
    	   }else {
    		   map.put(first, second);
    	   }
    	   
       }
    
	}}	
			
			
			/* int n = 5;
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        System.out.println("The symmetric pairs are: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
                    System.out.print("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
                    break;
                }
            }
        }
    }Map<Integer, Integer> map = new HashMap<>();
		for (int[] pair : pairs) {
            int first = pair[0];
            int second = pair[1];

            // Check if reverse pair exists
            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + first + ", " + second + ")");
            } else {
                map.put(first, second);
            }
}*/

/*HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    System.out.println("The Symmetric Pairs are: ");
    for (int i = 0; i < arr.length; i++) {
      int first = arr[i][0];
      int second = arr[i][1];
      if (mp.get(second) != null && mp.get(second) == first) {
        System.out.print("("+first + " " + second+") ");
      } else {
        mp.put(first, second);
      }
    }

  }
}*/
	
