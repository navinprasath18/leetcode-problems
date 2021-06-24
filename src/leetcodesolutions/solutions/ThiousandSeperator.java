package leetcodesolutions.solutions;

public class ThiousandSeperator {

	public static void main(String[] args) {
		System.out.println(thousandSeparator(123987));
	}

	public static String thousandSeparator(int n) {

		String str = String.valueOf(n);

		StringBuilder sb = new StringBuilder();
		int c = 0;
		for (int i = str.length(); i > 0; i--) {
			if (c == 3&&str.length()>3) {
				sb.append(".");
				c = 0;
			}
			sb.append(str.charAt(i - 1));
			c++;
			

		}

		return sb.reverse().toString();

	}

}
