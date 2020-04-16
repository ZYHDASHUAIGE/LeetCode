package LeetCode101_200;

import java.util.*;

public class LeetCode102_LevelOrder {

	
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null)
	        return new ArrayList<>();
	    List<List<Integer>> res = new ArrayList<>();
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    queue.add(root);
	    while(!queue.isEmpty()){
	        int count = queue.size();
	        List<Integer> list = new ArrayList<Integer>();
	        while(count > 0){
	            TreeNode node = queue.poll();
	            list.add(node.val);
	            if(node.left != null)
	                queue.add(node.left);
	            if(node.right != null)
	                queue.add(node.right);
	            count--;
	        }
	        res.add(list);
	    }
	    return res;
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
