package LeetCode101_200;

public class LeetCode104_MaxDeepthOfBinaryTree{

	public static void main(String[] args) {
		Anonymous a  = new Anonymous() {
			
			@Override
			public void add() {
				System.out.println(3);
				
			}
		};
		
		a.add();
	}
    public static int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
    
    public void test() {
    	
    }

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val){
			this.val = val;
		}
	}

	public static abstract class Anonymous{
		public void add(){

		};
	}
}
