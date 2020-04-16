package LeetCode101_200;


public class LeetCode143_ReorderList {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		reorderList(head);
		show(head);
	}
	
	public static void reorderList(ListNode head) {
        if(head==null) return;
        ListNode quick = head;
        ListNode slow = head;
        
        while(quick.next!=null&&quick.next.next!=null) {
        	slow = slow.next;
        	quick = quick.next.next;
        }

		ListNode list = reverse(slow.next);
		slow.next = null;
		ListNode cur = head;

		
		while (list != null && cur != null) {
			ListNode temp1 = cur.next;
			ListNode temp2 = list.next;
			cur.next = list;
			cur = temp1;
			list.next = temp1;
			list = temp2;
		}
		
		 
	}
	public static ListNode reverse(ListNode head) {
		
		ListNode cur = head;
        ListNode pre = null;
        
        if(head ==null) {
        	return null;
        }
        else {
        	while(head!=null) {
        		cur = head.next;
        		head.next = pre;
        		pre = head;
        		head = cur;
        	}
        }
		return pre;
	}
	
	public static void show(ListNode head) {
		if(head==null) return;
		System.out.println(head.val);
		show(head.next);
	}

	public static class ListNode{
		ListNode next;
		int val;

		public ListNode(int val){
			this.val = val;

		}
	}
}
