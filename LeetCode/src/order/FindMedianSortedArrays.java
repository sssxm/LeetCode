package order;

import java.util.Arrays;

/**
 * 4
 * Median of Two Sorted Arrays 
 * @author Ximin She
 *
 */
public class FindMedianSortedArrays {
	public static void main(String[] args) {
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		System.out.println(findMedianSortedArrays(nums1, nums2));

	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        
        
        int size = 0;
        for(int i = 0; i < nums1.length; i++){
        	nums3[size++] = nums1[i];
        }
        
        for(int i = 0; i < nums2.length; i++){
        	nums3[size++] = nums2[i];
        }
        Arrays.sort(nums3);
        if(size % 2 == 1){
        	return nums3[size / 2];
        } else {
        	return (nums3[(size / 2)] +  nums3[(size / 2) - 1]) / 2.0;
        }
    }
}
