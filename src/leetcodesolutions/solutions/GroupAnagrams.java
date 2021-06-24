package leetcodesolutions.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.print(groupAnagrams(strs));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		TreeMap<String, List<String>> map = new TreeMap<String, List<String>>();

		for (String s : strs) {
			char tmp[] = s.toCharArray();
			Arrays.sort(tmp);
			String key = String.valueOf(tmp);
		
			
			if (map.keySet().contains(key)) {
				map.get(key).add(s);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(s);
				map.put(key, list);
			}

		}

		List<List<String>> sol = new ArrayList<List<String>>();
		for (String s : map.keySet()) {
			sol.add(map.get(s));
		}
		return sol;

	}

}
