package leetcodesolutions.solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
// https://leetcode.com/problems/first-missing-positive/
public class SmallestMissingPositivenumber {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 0 };
		int nums2[] = { 3, 4, -1, 1 };
		int nums3[] = { 7, 8, 9, 11, 12 };
		int nums4[] = { -1 };
		int nums5[] = { 0, 2, 2, 1, 1 };

		System.out.println(firstMissingPositive(nums));
		System.out.println(firstMissingPositive(nums2));
		System.out.println(firstMissingPositive(nums3));
		System.out.println(firstMissingPositive(nums4));
		System.out.println(firstMissingPositive(nums5));

	}

	public static int firstMissingPositive(int[] nums) {
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		int i = 1;
		while (true) {

			if (set.contains(i)) {
				i++;
			} else {
				return i;
			}
		}

	}
}
