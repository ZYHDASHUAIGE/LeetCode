package LeetCode001_100;

import java.util.*;

public class LeetCode094_InOrder {

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }
	
	public static void inorderTraversal(TreeNode root,List<Integer> list) {
		if(root == null) return;		
		inorderTraversal(root.left, list);
		list.add(root.val);
		inorderTraversal(root.right,list);
		
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
