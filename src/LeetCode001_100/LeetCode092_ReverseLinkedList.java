package LeetCode001_100;

public class LeetCode092_ReverseLinkedList {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        
		ListNode dummy = new ListNode(0);
        dummy.next = head;  //head就可以滑动了
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        //pre永远不变，head和post每循环一次就移位一次，实际就是head一直跟这第一次复制的value
        for(int i = m; i < n; i++){
            ListNode post = head.next;
            head.next = post.next;
            post.next = pre.next;
            pre.next = post;
        }
        return dummy.next;
    }
	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
