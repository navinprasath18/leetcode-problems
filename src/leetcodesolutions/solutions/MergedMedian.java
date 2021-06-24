package leetcodesolutions.solutions;

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
		
		List<Integer> set = new ArrayList<Integer>();
	//	set.add(Arrays.asList(nums1));
	//	set.add(Arrays.asList(nums2));
	//
	//	double sol = add / (double)(nums1.length + nums2.length);

		return 0;

	}

}
