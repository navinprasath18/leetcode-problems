package leetcodesolutions.solutions;

public class IsNimeric {

	public static void main(String[] args) {

		System.out.println(isNumber("-0.1"));

		System.out.println(isNumber("-123.456e789"));
		System.out.println(isNumber("959440.94f"));
	}

public static boolean isNumber(String strNum) {
    if (strNum == null || strNum.equalsIgnoreCase("Infinity")) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
        System.out.println(d);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
}