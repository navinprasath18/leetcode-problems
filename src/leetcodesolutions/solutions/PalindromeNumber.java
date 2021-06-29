package leetcodesolutions.solutions;

public class PalindromeNumber {

	public static void main(String[] args) {

	}

	public static boolean isPalindrome(int x) {
		StringBuilder str = new StringBuilder(String.valueOf(x));
		str.reverse();
		if (String.valueOf(x).equals(str.toString()))
			return true;
		return false;
	}

}
