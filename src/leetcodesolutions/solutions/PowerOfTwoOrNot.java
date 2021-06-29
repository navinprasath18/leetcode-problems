package leetcodesolutions.solutions;

// https://leetcode.com/problems/power-of-two/

// time limit exceeded
public class PowerOfTwoOrNot {

	public static void main(String[] args) {

		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(-16));
		System.out.println(isPowerOfTwo(100000));
		System.out.println(isPowerOfTwo(54));
		System.out.println(isPowerOfTwo(1024));

	}

	public static boolean isPowerOfTwo(int n) {
		while (n % 2 != 1)
			n = n / 2;
		if (n == 1)
			return true;
		else
			return false;

	}

}
