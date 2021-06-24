package leetcodesolutions.solutions;

public class CountPrimeNumbers {

	public static void main(String[] args) {
		System.out.print(countprime(100));
	}

	static int countprime(int n) {
		int sol = 0;
		for (int i = 1; i <= n; i++) {
			if (!isPrime(n))
				sol++;
		}
		return sol;

	}

	static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

}
