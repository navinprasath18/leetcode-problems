package leetcodesolutions.solutions;

import java.util.HashSet;
import java.util.Set;

//
// not solved - not working

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("au"));
		System.out.println(lengthOfLongestSubstring("dvdf"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring(""));

	}

	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 1)
			return 1;
		if (s.length() == 0)
			return 0;
		int max = 1;
		Set<Character> set = new HashSet<Character>();
		int a = 0;
		int b = 0;

		while (a < s.length()) {
			for (int i = a ; i < s.length(); i++) {
				if (!set.contains(s.charAt(i))) {
					set.add(s.charAt(i));
					max = Math.max(set.size(), max);
				} else {
					set.clear();
				}
			}
			a++;
		}
		return max;
	}
}
