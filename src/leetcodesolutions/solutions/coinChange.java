package leetcodesolutions.solutions;

import java.util.Arrays;

public class coinChange {

	public static void main(String[] args) {
		int[] nums = { 186, 419, 83, 408 };
		System.out.print(coinChange(nums, 6249));
	}

	public static int coinChange(int[] coins, int amount) {

		Arrays.sort(coins);
		int sol = 0;
		for (int i = coins.length - 1; i >= 0; i--) {
			if (amount > 0) {

				sol = sol + (amount / coins[i]);
				amount = amount % coins[i];
				System.out.println(amount);
			}
		}
		if (amount > 0)
			return -1;
		return sol;
	}

}
