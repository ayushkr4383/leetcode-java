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
    public int minDepth(TreeNode root) {
        int deep=0;
        int ans = depth(root, deep);
        return ans;
    }
    int depth(TreeNode root, int deep){
        TreeNode temp =root;
        if(temp==null){
            return 0;
        }
        int leftdepth = depth(temp.left, deep+1);
        int rightdepth = depth(temp.right, deep+1);
        if(leftdepth==0|| rightdepth==0){
            return 1+Math.max(leftdepth, rightdepth);
        }else{
            return 1+Math.min(leftdepth, rightdepth);
        }
    }
}