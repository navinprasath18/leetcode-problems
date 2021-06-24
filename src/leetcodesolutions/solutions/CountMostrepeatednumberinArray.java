package leetcodesolutions.solutions;

import java.util.TreeMap;

public class CountMostrepeatednumberinArray {

	public static void main(String[] args) {

		int[] n = { 1, 3, 4, 3, 2, 3, 4, 5, 6, 35, 35, 45, 4, 5, 45, 45, 45, 45, 45, 4, 5, 45, 45 };
		System.out.print(sol(n));

	}

	public static int sol(int[] arr) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i : arr) {
			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
		}

		return map.lastKey();
	}
}
