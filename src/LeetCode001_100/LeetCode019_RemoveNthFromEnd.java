package LeetCode001_100;

public class LeetCode019_RemoveNthFromEnd {
	
	public static void main(String[] args) {
		ListNode head =new ListNode(0);
		head.next  = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		ListNode headAfter = removeNthFromEnd(head, 2);
		System.out.println(headAfter.value+" "+headAfter.next.value+" "+headAfter.next.next.value+" "+headAfter.next.next.next.value+" "+
		headAfter.next.next.next.next.value+" ");
		
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
        int count = 0;
        while(p!=null){
            count++;
            p = p.next;
        }
        if (n>count){
            return head;
        }
        if (n==count){
            return head.next;
        }
        p = head;
        ListNode pre = p;
        for (int i=0;i<count-n;i++){
            pre = p;
            p = p.next;
        }
        pre.next = p.next;
        return  head;
	}
	
	

}

class ListNode {
	ListNode next;
	int value;
	public ListNode(int x) {
		value=x;
	}
}