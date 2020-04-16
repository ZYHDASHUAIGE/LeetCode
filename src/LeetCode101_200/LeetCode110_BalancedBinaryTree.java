package LeetCode101_200;


public class LeetCode110_BalancedBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(4);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		//root.right = new TreeNode(2);
		System.out.println(height(root.left)+" "+height(root.right));
		System.out.println(isBalanced(root));
	}
	
	public static boolean isBalanced(TreeNode root) {
		if(root==null) return true;
		else {
			if(Math.abs(height(root.left)-height(root.right))>1) return false;
			return isBalanced(root.left)&&isBalanced(root.right);
		}
        
    }

	public static int height(TreeNode root) {
		if(root==null) return 0;
		return Math.max(height(root.left), height(root.right))+1;
	}
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val){
			this.val = val;
		}
	}
}
