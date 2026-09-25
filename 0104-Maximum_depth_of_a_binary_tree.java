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
    public int maxDepth(TreeNode root) {
        int deep=0;
        int k = depth(root, deep);
        return k;
    }
    int depth(TreeNode root, int deep){
        TreeNode curr=root;
        if(curr==null){
            return 0;
        }
        int leftdepth= depth(curr.left, deep+1);
        int rightdepth = depth(curr.right, deep+1);
        return 1+Math.max(leftdepth, rightdepth);
    }
}