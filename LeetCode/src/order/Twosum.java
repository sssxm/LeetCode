package order;



/**
 * 1
 * two sum  
 * @author Ximin She
 *
 */
public class Twosum {

	public static void main(String[] args) {
		int[] input = {0,4,3,0};
		int target = 0;
		int[] output = twoSum(input, target);
		System.out.println(output[0]);
		System.out.println(output[1]);

	}
	
	public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
            	if (nums[i] + nums[j] == target){
            		int[] output = {i, j};
            		return output;
            	}
            }
        }
		return nums;
    }

}
