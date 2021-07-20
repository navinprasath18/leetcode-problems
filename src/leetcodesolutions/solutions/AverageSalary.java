package leetcodesolutions.solutions;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
public class AverageSalary {

	public static void main(String[] args) {
		int[] salary = { 48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000,
				28000, 4000, 54000, 67000, 6000, 1000, 11000 };
		System.out.print(average(salary));
	}

	public static double average(int[] salary) {
		int min = salary[0];
		int max = salary[0];
		int sum = 0;

		for (int i = 0; i < salary.length; i++) {
			min = Math.min(salary[i], min);
			max = Math.max(salary[i], max);
			sum = sum + salary[i];
		}

		sum = sum - (min + max);
		return sum / (double)(salary.length - 2);

	}

}
