package leetcodesolutions.solutions;

public class MinStack {

	Node head = null;

	public void push(int val) {

		if (head == null) {
			head = new Node(val, val, null);
		} else {
			int min = Math.min(val, head.min);
			Node newnode = new Node(val, min, head);
			head = newnode;
		}

	}

	public void pop() {
		if (head != null) {
			if (head.next != null) {
				head = head.next;
			} else {
				head = null;
			}
		}

	}

	public int top() {
		return head.val;

	}

	public int getMin() {

		return head.min;

	}

	class Node {
		int val;
		int min;
		Node next;

		private Node() {

		}

		public Node(int val, int min, Node next) {
			this.val = val;
			this.min = min;
			this.next = next;
		}

	}

}
