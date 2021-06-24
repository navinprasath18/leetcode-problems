package leetcodesolutions.solutions;
//https://leetcode.com/problems/fizz-buzz/
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {

		System.out.print(fizzBuzz(5));

	}

	public static List<String> fizzBuzz(int n) {
		List<String> str = new ArrayList<String>();
		for (int i = 1; i <=n; i++) {
			StringBuilder sb = new StringBuilder();
			if (i % 3 == 0) {
				sb.append("Fizz");
			}
			if (i % 5 == 0) {
				sb.append("Buzz");
			}

			str.add(sb.toString().isBlank() ? String.valueOf(i) : sb.toString());
		}
		return str;

	}

}
