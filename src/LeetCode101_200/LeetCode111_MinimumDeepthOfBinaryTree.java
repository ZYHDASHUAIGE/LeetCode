package LeetCode101_200;



public class LeetCode111_MinimumDeepthOfBinaryTree {

	public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        else if(root.left==null) return minDepth(root.right)+1;
        else if(root.right==null) return minDepth(root.left)+1;
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
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
