package leetcodesolutions.solutions;

// https://leetcode.com/problems/divide-two-integers/
public class DivisionWithoutOperator {

	public static void main(String[] args) {

		System.out.println(divide(-2147483648, -1));

	}

	public static int divide(int dividend, int divisor) {
		double d = dividend;
		double ds = divisor;
		int count = 0;
		int flag = 0;
		if (d < 0) {
			flag++;
			d = -d;
		}
		if (ds < 0) {
			flag++;
			ds = -ds;

		}

		while (d >= ds) {
			count++;
			d = d - ds;
		}
		if (flag == 1)
			return -count;
		return count;

	}

}
