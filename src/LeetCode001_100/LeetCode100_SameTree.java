package LeetCode001_100;
;

public class LeetCode100_SameTree {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(0);
		TreeNode q = new TreeNode(0);
		p.left = new TreeNode(1);
		q.left = new TreeNode(1);
		System.out.println(isSameTree(p, q));
	}
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if(p==null&&q!=null) return false;
        else if(p!=null&&q==null) return false;
        return p.val==q.val&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
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
