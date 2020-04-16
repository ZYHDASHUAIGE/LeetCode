package LeetCode001_100;



public class LeetCode021_MergeTwoSortedList {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		LeetCode021_MergeTwoSortedList l = new LeetCode021_MergeTwoSortedList();
		ListNode a = l.mergeTwoLists(l1, l2);
		while(a!=null) {
			System.out.println(a.val+" ");
			a = a.next;
		}
		
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode cur= dummy;
		while(l1!=null||l2!=null) {
			if(l1!=null&&l2!=null) {
				if(l1.val>l2.val) {
					cur.next = l2;
					cur=cur.next;
					l2 = l2.next;
				}else {
					cur.next=l1;
					cur=cur.next;
					l1 = l1.next;
				}
			}else if(l1!=null) {
				cur.next = l1;
				cur = cur.next;
				l1=l1.next;
			}else if(l2!=null) {
				cur.next = l2;
				cur = cur.next;
				l2=l2.next;
			}
			
		}
		
		
		return dummy.next;

	}

	public static class ListNode{
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}
	
}


