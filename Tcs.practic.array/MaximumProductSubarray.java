package tcs.practice.array;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		
		int nums[]= {1,2,5,0,9,6,7,5,0,8};

		maximumproduct(nums);
	}

	private static void maximumproduct(int[] nums) {
		
		if(nums.length ==0 || nums==null) {
			System.out.println("0");
		}
		
		int max = nums[0];
		int min = nums[0];
		int res = nums[0];
		
		for(int i=0;i<nums.length;i++) {
			
			int current = nums[i];
			
			if(current <= 0) {
				int temp =max;
				max= min;
				min = temp;
				
			}
			
			max = Math.max(current, current*max);
			min = Math.min(current, current*min);
			res = Math.max(max, res);
		}
		System.out.println(res);
		
	}
}
