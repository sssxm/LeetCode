package array;

import java.util.Arrays;

/**
 * 561
 * 	Array Partition I   
 * @author Ximin She
 *
 */
public class ArrayPartitionI {

	public static void main(String[] args) {
		int[] array = {1, 1};
		System.out.println(arrayPairSum(array));
		
	}
	
	public static int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i+=2){
			sum+=nums[i];
		}
		return sum;
        
    }

}
