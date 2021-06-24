package leetcodesolutions.solutions;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("ate", "tea"));
		System.out.print(isAnagram("ate2", "tea"));

	}

	public static boolean isAnagram(String s, String t) {

		char a1[] = s.toCharArray();
		char a2[] = t.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);
		if (String.valueOf(a1).equals(String.valueOf(a2))) {
			return true;
		}
		return false;
	}
}
