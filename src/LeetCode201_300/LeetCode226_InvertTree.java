package LeetCode201_300;

public class LeetCode226_InvertTree {

	public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left=left;
        root.right=right;
        return root;
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
