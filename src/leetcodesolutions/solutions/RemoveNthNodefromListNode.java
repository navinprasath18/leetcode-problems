package leetcodesolutions.solutions;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodefromListNode {
	public static void main(String[] args) {

		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
		removeNthFromEnd(head, 2);
		System.out.println("");
		while (head.next != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);

	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		 int count = 1;
			ListNode node = head;
			while (node.next != null)
			{
				count++;
			node = node.next;
			}
			count = count - n;
			node= head;
			int i = 1;
			while (i != count) {
				i++;
				if(node.next!=null)
				node = node.next;
			}
			if(node.next.next!=null)
			node.next = node.next.next;
			return head;

	}

}
