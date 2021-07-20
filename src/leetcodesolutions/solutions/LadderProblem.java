package leetcodesolutions.solutions;

public class LadderProblem {

	public static void main(String[] args) {
		System.out.println(climbStairs(8));
	}

	public static int climbStairs(int n) {

		if (n < 2) {
			return 1;
		}
		int a = 1;
		int sol = 2;
		int i = 3;
		while (i <= n) {
			int temp = sol;
			sol = sol + a;
			a = temp;
			i++;
		}

		return sol;
	}

}
