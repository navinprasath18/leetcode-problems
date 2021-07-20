package leetcodesolutions.solutions;

import java.util.PriorityQueue;

public class kthLargestinArray {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 1;
		System.out.print(findKthLargest(nums, k));

	}

	public static int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for (int i = 0; i < nums.length; i++) {
			queue.add(nums[i]);
			if (queue.size() > k)
				queue.remove();

		}
		return queue.remove();

	}

}
