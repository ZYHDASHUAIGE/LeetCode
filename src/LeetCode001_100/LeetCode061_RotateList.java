package LeetCode001_100;

public class LeetCode061_RotateList {
	
	public static void main(String[] args) {
		
	}
	
	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null||head.next==null) return head;
		ListNode index = head;
		int length = 1;
		//get list length 
		while(index.next!=null) {
			index = index.next;
			length++;
		}
		index.next = head;
		for(int i=1;i<length-k%length;i++) {
			head = head.next;
		}
		ListNode res = head.next;
		head.next = null;
		return res;
	}

	public static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val = val;
		}
	}
}


	
