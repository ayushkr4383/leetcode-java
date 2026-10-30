/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode mainroot = delete(root, key);
        return mainroot;
    }
    TreeNode delete(TreeNode root, int key){
        if(root==null) return null;
        if(root.val>key) root.left=delete(root.left,key);
        else if(root.val<key) root.right=delete(root.right,key);
        else{
            if(root.right==null && root.left==null) return null;
            if(root.right==null) return root.left;
            if(root.left==null) return root.right;
            TreeNode successor=root.right;
            while(successor.left!=null){
                successor=successor.left;
            }
            root.val=successor.val;
            root.right=delete(root.right, successor.val);
        }
        return root;
    }
}