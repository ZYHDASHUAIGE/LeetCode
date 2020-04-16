package LeetCode101_200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class LeetCode107_LevelOrder {
	
	
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> input = levelOrder(root);
		List<List<Integer>> res = new ArrayList<>();
		if(root==null) return new ArrayList<>();;
		
		for(int i=input.size()-1;i>=0;i--) {
			res.add(input.get(i));
		}
		return res;
		
		
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null) return new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int count = queue.size();
			List<Integer> list = new ArrayList<>();
			while(count>0) {
				TreeNode node= queue.poll();
				list.add(node.val);
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
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
