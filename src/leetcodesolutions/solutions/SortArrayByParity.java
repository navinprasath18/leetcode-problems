package leetcodesolutions.solutions;

public class SortArrayByParity {

	public static void main(String[] args) {
		int[] nums = { 0, 1 };
		var sol = sortArrayByParity(nums);
		for (int i : sol) {
			System.out.print(i + " ");
		}
	}

	public static int[] sortArrayByParity(int[] nums) {

		int a = 0;
		int b = nums.length - 1;
		while (a < b) {
			if (nums[a] % 2 == 0)
				a++;
			if (nums[b] % 2 != 0)
				b--;
			if (nums[a] % 2 != 0 && nums[b] % 2 == 0) {
				int tmp = nums[a];
				nums[a++] = nums[b];
				nums[b--] = tmp;
			}
		}
		return nums;
	}

}
