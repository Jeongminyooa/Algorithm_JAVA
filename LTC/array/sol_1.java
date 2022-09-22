package array;

// 1. Two Sum
public class sol_1 {
	
	 public int[] twoSum(int[] nums, int target) {

	        int[] result = new int[2];

	        for(int i = 0; i < nums.length; i++) {
	            int sum = nums[i];
	            for(int j = i + 1; j < nums.length; j++) {
	                if(sum + nums[j] == target) {
	                    result[0] = i;
	                    result[1] = j;

	                    return result;
	                }
	            }
	        }
	        return result;
	    }
	 
}
