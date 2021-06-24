package leetcodesolutions.solutions;
// https://leetcode.com/problems/median-of-two-sorted-arrays/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedMedian {
	public static void main(String[] args) {
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2, 7 };

		System.out.print(findMedianSortedArrays(nums1, nums2));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int nums[] = new int[nums1.length + nums2.length];
		System.arraycopy( nums1, 0, nums, 0, nums1.length);
		System.arraycopy( nums2, 0, nums, nums1.length, nums2.length );
		Arrays.sort(nums);
		if(nums.length%2!=0)
			return nums[nums.length/2];
		

		return (nums[nums.length/2]+nums[(nums.length/2)-1])/(double)2;

	}

}
