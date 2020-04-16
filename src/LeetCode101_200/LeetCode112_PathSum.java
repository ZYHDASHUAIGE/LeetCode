package LeetCode101_200;



public class LeetCode112_PathSum {

	public static boolean hasPathSum(TreeNode root, int sum) {
		if(root==null) return false;
        if(root.left==null&&root.right==null) return root.val==sum;
        return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
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
