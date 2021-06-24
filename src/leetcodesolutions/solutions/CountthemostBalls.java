package leetcodesolutions.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
public class CountthemostBalls {

	public static void main(String[] args) {
		System.out.print(countBalls(1, 10));
	}

	public static int countBalls(int lowLimit, int highLimit) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = lowLimit; i <= highLimit; i++) {
			int temp = i;
			int val = 0;
			while (temp > 0) {
				val = val + (temp % 10);
				temp = temp / 10;
			}

			map.put(val, map.containsKey(val) ? map.get(val) + 1 : 1);
		}

		return map.values().stream().sorted().collect(Collectors.toList()).get(map.size() - 1);

	}

}
