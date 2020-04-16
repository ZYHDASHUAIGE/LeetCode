package LeetCode001_100;

public class LeetCode002_AddTwoNumber {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(3);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(4);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(3);
		int result = addTwoNumbers(l1, l2).val;
        int result2 = addTwoNumbers(l1, l2).next.val;
        int result3 = addTwoNumbers(l1, l2).next.next.val;
        System.out.println("��������3->6->4+4->4->3,�������:");
        System.out.println();
        System.out.println(result+"->"+result2+"->"+result3);
	}
	
	 static class ListNode{
		int val;
		ListNode next;
	    ListNode(int x) {
			val = x;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		int sum =0;
		ListNode cur = dummy;
		ListNode p1=l1,p2=l2;		
		while(p1!=null||p2!=null) {
			if(p1!=null) {
				sum=sum+p1.val;
				p1=p1.next;
			}
			if(p2!=null) {
				sum=sum+p2.val;
				p2=p2.next;
			}
			cur.next = new ListNode(sum%10);
			sum=sum/10;
			cur=cur.next;
		}
		if(sum==1) {
			cur.next =new ListNode(1);
		}
		
		return dummy.next;
	}
}
