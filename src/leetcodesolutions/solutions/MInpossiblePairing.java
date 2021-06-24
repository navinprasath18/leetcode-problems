package leetcodesolutions.solutions;

import java.util.Arrays;

//https://leetcode.com/problems/array-partition-i/
public class MInpossiblePairing {

	public static void main(String[] args) {

		int nums[] = { 1, 4, 3, 2 };

		System.out.print(arrayPairSum(nums));

	}

	public static int arrayPairSum(int[] nums) {
		int ans = 0;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i = i + 2)
			ans = ans + nums[i];

		return ans;

	}

}
//1 2 2 5 6 6