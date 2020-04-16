package LeetCode201_300;

public class LeetCode236_LowestCommonAncestor {

	public static void main(String[] args) {
		
	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null ||p==null||q==null) return null;
        if(root.val==p.val||root.val==q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!=null&&right!=null) return root;
        if(left==null) return right;
        else return left;
    }
	
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val) {
			this.val = val;
		}
	}
}
