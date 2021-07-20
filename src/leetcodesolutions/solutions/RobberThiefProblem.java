package leetcodesolutions.solutions;

public class RobberThiefProblem {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
		System.out.println(robbersol(nums));
	}

	public static int robbersol(int[] num)
	{
	int prevNo = 0;
    int prevYes = 0;
    for (int n : num) {
        int temp = prevNo;
        prevNo = Math.max(prevNo, prevYes);
        prevYes = n + temp;
    }
    return Math.max(prevNo, prevYes);
	}
}
