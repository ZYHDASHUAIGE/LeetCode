package LeetCode401_500;

public class LeetCode437_PathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.left.left.left = new TreeNode(-1);
		root.right.left = new TreeNode(-2);
		//System.out.println();
		//pathSum(root, -1);
		System.out.println(findPath(root, -1));
	}

	//包含或者不包含当前节点
	public static int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        else {
        	int res = findPath(root, sum);
        	System.out.println(res);
        	res+= pathSum(root.left, sum);
        	res+= pathSum(root.right, sum);
        	return res;
        }
    }

	//包含当前节点的路径
	private static int findPath(TreeNode node,int num) {
		if (node == null)
			return 0;

		int left=findPath(node.left,num-node.val);
        int right=findPath(node.right,num-node.val);
        
        if(node.val==num){
            return right+left+1;
        }else{
            return right+left;
        }	
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

