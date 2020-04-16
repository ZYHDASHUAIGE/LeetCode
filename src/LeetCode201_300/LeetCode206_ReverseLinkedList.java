package LeetCode201_300;

public class LeetCode206_ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		ListNode newNode = reverseList(head);
		while(newNode!=null) {
			System.out.println(newNode.val);
			newNode = newNode.next;
		}

	}
	
	public static ListNode reverseList(ListNode head) {
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

    public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

}

