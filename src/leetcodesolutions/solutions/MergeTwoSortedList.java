package leetcodesolutions.solutions;

public class MergeTwoSortedList {

	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode();
		ListNode head = l3;
		if (l1.val >= l2.val) {
			l3.val = l2.val;
			l2 = l2.next;
		} else {
			l3.val = l1.val;
			l1 = l1.next;
		}
		return l3;

	}
}
