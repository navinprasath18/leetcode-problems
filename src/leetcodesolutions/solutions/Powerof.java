package leetcodesolutions.solutions;

public class Powerof {

	public static void main(String[] args) {
		System.out.print(power(3, 3));

	}

	public static int power(int n, int p) {
		if (p == 1)
			return n;
		if (p % 2 == 0)
			return power(n * n, n / 2);
		else
			return n * power(n * n, n / 2);

	}
}
