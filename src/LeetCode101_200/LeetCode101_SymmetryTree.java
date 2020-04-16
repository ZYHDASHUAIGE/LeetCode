package LeetCode101_200;

public class LeetCode101_SymmetryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isSymmetric(root.left, root.right);
    }
	private static boolean isSymmetric(TreeNode left,TreeNode right) {
		 if(left==null&&right==null) return true;
		 else if(left!=null&&right==null) return false;
		 else if (left==null&&right!=null) return false;
		 return left.val==right.val&&isSymmetric(left.right, right.left)&&isSymmetric(left.left, right.right);
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
