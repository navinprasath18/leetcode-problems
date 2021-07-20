package leetcodesolutions.solutions;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sol = maxSubArray(nums);
		System.out.println(" sol : "+sol);

	}

	public static int maxSubArray(int[] nums) {
		int maxSoFar = nums[0], maxEndingHere = nums[0];
		for (int i = 1; i < nums.length; ++i) {
			maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
			System.out.print(" "+maxEndingHere);
			maxSoFar = Math.max(maxEndingHere, maxSoFar);
		}
		return maxSoFar;

	}

}
