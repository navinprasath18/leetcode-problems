package leetcodesolutions.solutions;

public class Node {

	public int val;
	public Node left;
	public Node right;

	public Node(int value) {
		val = value;
		right = null;
		left = null;
	}

	public Node() {

	}

	public static Node add(Node current, int value) {
		if (current == null) {
			System.out.println("-added-" + value);
			return new Node(value);
		}

		if (value < current.val) {
			current.left = add(current.left, value);
			// System.out.println("-left-");
		} else if (value > current.val) {
			current.right = add(current.right, value);
			// System.out.println("-right-");
		} else {
			System.out.println(value + ":-already exist-");
			return current;
		}

		return current;
	}

}
