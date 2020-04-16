package LeetCode101_200;

import java.util.*;

public class LeetCode144_PreOrder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(2);
		//List<Integer> a = new ArrayList<>();
		List<Integer> a = preorderTraversal(root);
		//preorderTraversal(root, a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}
	
	public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list;	
    }
	
	public static void preorderTraversal(TreeNode root,List<Integer> list) {
		if(root == null) return;
		
		list.add(root.val);
		preorderTraversal(root.left, list);
		preorderTraversal(root.right,list);
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
