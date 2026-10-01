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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int sum = root.val;
        int ans = inorder(root, sum, targetSum);
        if(ans==1){
            return true;
        }
        else{
            return false;
        }
    }
    int inorder(TreeNode root, int sum, int targetSum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                return 1;
                
            }
            else{
               
                return  sum = sum-root.val;
            }
        }
        inorder(root.left, sum+root.left.val, targetSum);
        inorder(root.right, sum+root.right.val, targetSum);
    
}