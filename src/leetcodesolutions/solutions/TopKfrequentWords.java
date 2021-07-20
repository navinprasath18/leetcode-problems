package leetcodesolutions.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/top-k-frequent-words/
public class TopKfrequentWords {

	public static void main(String[] args) {

		String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
		int k = 4;
		List<String> sol = topKFrequent(words, k);
		sol.forEach(a -> System.out.println(a));
	
	}

	public static List<String> topKFrequent(String[] words, int k) {

		List<String> sol = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			int count = map.containsKey(words[i]) ? map.get(words[i]) : 0;
			if (count != 0)
				map.put(words[i], count + 1);
			else
				map.put(words[i], 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == k)
				sol.add(entry.getKey());
		}

		return sol;

	}
}
