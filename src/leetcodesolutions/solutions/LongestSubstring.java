package leetcodesolutions.solutions;

import java.util.HashSet;
import java.util.Set;
//
// not solved - not working

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("jbpnbwwd"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring(" "));

	}

	public static int lengthOfLongestSubstring(String s) {
		Set<Character> sol = new HashSet<Character>();
		if(s.length()==1)
			return 1;
		int max = 0;
		char[] arr = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				char c = arr[j];
				if (set.contains(c)) {
					if (max < set.size())
					{
					max = set.size();
					sol.clear();
					sol.addAll(set);
					}
					set.clear();
					continue;
				} else {
					set.add(c);
				}
			}
		}

		System.out.println(sol);
		return max;

	}
}
