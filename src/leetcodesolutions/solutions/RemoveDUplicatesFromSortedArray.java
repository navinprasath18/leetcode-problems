package leetcodesolutions.solutions;

public class RemoveDUplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		removeDuplicates(nums);

	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int num : nums) {
			if (num != nums[i]) {
				i++;
				nums[i] = num;
			}
		}
		return i;

	}
}
