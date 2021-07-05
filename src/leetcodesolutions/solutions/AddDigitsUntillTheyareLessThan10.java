package leetcodesolutions.solutions;

public class AddDigitsUntillTheyareLessThan10 {

	public static void main(String[] args) {
		System.out.print(addDigits(38));
	}

	public static int addDigits(int num) {

		if (num < 10)
			return num;
		int temp = 0;
		while (num > 0) {
			temp = temp + num % 10;
			num = num / 10;

		}
		return addDigits(temp);

	}

}
