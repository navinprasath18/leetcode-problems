package leetcodesolutions.solutions;

public class TestStack {

	public static void main(String[] args) {
		MinStack min = new MinStack();
		min.push(-2);
		min.push(0);
		min.push(-1);
		System.out.print(min.getMin());

	}

}
