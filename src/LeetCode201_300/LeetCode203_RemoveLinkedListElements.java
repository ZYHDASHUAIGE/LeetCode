package LeetCode201_300;

public class LeetCode203_RemoveLinkedListElements {

	public static void main(String[] args) {

	}

	public static  ListNode removeElements(ListNode head, int val) {
	       ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
			dummyHead.next = head;
			ListNode prev = dummyHead;
			while(prev.next!=null) {
				if(prev.next.val==val) {			
					
					prev.next = prev.next.next;
					
				}else {
					prev = prev.next;
				}
			}
			return dummyHead.next;
	    }

	    public static class ListNode {
			int val;
			ListNode next;

			public ListNode(int val) {
				this.val = val;
			}
		}

}

