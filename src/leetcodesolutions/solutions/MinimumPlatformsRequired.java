package leetcodesolutions.solutions;

public class MinimumPlatformsRequired {

	public static void main(String[] args) {

		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println(minplatforms(arr, dep));

	}

	public static int minplatforms(int[] arr, int[] dep) {
		int maxplats = 1;
		int plat = 0;
		int a = 0, b = 0;
		while (a < arr.length && b < arr.length) {
			if (arr[a] < dep[b]) {
				plat++;
				a++;
				maxplats = Math.max(plat, maxplats);
			} else {
				plat--;
				b++;
			}

		}
		while (b < arr.length) {
			b++;
			plat++;
		}
		return maxplats;

	}

}
