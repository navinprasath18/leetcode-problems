package leetcodesolutions.solutions;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater11 {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.print(maxArea(height));
	}

	public static int maxArea(int[] height) {

		int max = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {

				int x = height[i] < height[j] ? height[i] : height[j];
				int y = j - i;
				int area = x * y;
				if(area > max )
					max = area;
			}

		}
		return max;

	}
}
