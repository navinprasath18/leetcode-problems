package leetcodesolutions.solutions;

// https://leetcode.com/problems/hamming-distance/
public class HammingDistance {

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		System.out.println(hammingDistance(x, y));
	}

	public static int hammingDistance(int x, int y) {

		var binary1 = String.format("%512s", Integer.toBinaryString(x)).replace(" ", "0").toCharArray();
		var binary2 = String.format("%512s", Integer.toBinaryString(y)).replace(" ", "0").toCharArray();

		System.out.println("b1---" + binary1);
		System.out.println("b2---" + binary2);
		int ans = 0;
		for (int i = 0; i < binary1.length; i++) {
			if (binary1[i] != binary2[i])
			{
				System.out.println(i + "---" + binary1[i] + " " + binary2[i]);
			ans++;
			}
		}

		return ans;

	}

}


//1073741824
