package LeetCode001_100;

public class LeetCode024_ExchangeNodeOfList {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		ListNode newHead = swapPairs(head);
		// System.out.println(head);
		System.out.println(newHead.value + " " + newHead.next.value + " " + newHead.next.next.value + " "
				+ newHead.next.next.next.value);
	}

	// 每次只交换两个节点
	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode l1 = dummy;
		ListNode l2 = head; // l2的位置一直不变
		while (l2 != null && l2.next != null) {
			ListNode nextStart = l2.next.next;
			l1.next = l2.next;
			l2.next.next = l2;
			l2.next = nextStart;
			l1 = l2; // 重复一个循环
			l2 = l2.next;
		}
		return dummy.next;

	}

	static class ListNode {
		int value;
		ListNode next;

		public ListNode(int x) {
			value = x;
		}
	}
}
