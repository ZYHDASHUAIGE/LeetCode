package LeetCode101_200;

import java.util.*;

public class LeetCode145_PostOrder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(2);
		List<Integer> a = postorderTraversal(root);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
	
	public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }
	
	public static void postorderTraversal(TreeNode root,List<Integer> list) {
		if(root == null) return;
		
		postorderTraversal(root.left, list);
		postorderTraversal(root.right,list);
		list.add(root.val);
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
