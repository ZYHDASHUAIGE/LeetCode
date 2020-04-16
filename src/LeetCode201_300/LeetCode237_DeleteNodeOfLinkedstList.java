package LeetCode201_300;

public class LeetCode237_DeleteNodeOfLinkedstList {

	public static void main(String[] args) {
		
	}
	
	public static void deleteNode(ListNode node) {
        //copy value of Node
		node.val = node.next.val;
		
		node.next = node.next.next;
    }

    public static class ListNode{
		int val;
		ListNode next;

		public ListNode(int val){
			this.val = val;
		}
	}
}
