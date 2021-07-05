package leetcodesolutions.solutions;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4, 5, 7 };
		int m = 6;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merge(nums1, m, nums2, n);
		for (Integer j : nums1) {
			System.out.print(j);
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = 0;
		for (int i = m; i < nums1.length; i++) {
			nums1[i] = nums2[index++];
		}

		Arrays.sort(nums1);
	}
}
