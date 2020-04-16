package LeetCode201_300;

import java.util.ArrayList;
import java.util.List;

public class LeetCode257_BinaryTreePath {

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root ==null) return list;
        else {
        	if(root.left==null&&root.right==null) {
        		list.add(String.valueOf(root.val));
        		return list;
        	}
        	List<String> lefts = binaryTreePaths(root.left);
        	for(int i=0;i<lefts.size();i++) {
        		list.add(String.valueOf(root.val)+"->"+lefts.get(i));
        	}
        	List<String> rights = binaryTreePaths(root.right);
        	for(int i=0;i<rights.size();i++) {
        		list.add(String.valueOf(root.val)+"->"+rights.get(i));
        	}
        	return list;
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
