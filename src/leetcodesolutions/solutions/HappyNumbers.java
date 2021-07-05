package leetcodesolutions.solutions;
// https://leetcode.com/problems/happy-number/
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

	public static void main(String[] args) {
		System.out.print(isHappy(18));
	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();

		while (n != 1) {
			int tmp = 0;
			while (n > 0) {
				tmp = (int) (tmp + Math.pow(n % 10, 2));
				n = n / 10;
			}
			n = tmp;
			if (set.contains(n))
				return false;
			set.add(n);

		}
		return true;

	}

}
