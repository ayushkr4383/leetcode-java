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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int instart=0, inend =inorder.length-1, poststart = 0, postend = postorder.length-1;
        TreeNode mainRoot = construct(instart, inend, inorder, poststart, postend, postorder);
        return mainRoot;
    }
    TreeNode construct(int instart, int inend, int[] inorder, int poststart, int postend, int[] postorder){
        if(poststart>postend){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postend]);
        int index=-1;
        int temp = root.val;
        for(int j=instart;j<=inend;j++){
            if(temp==inorder[j]){
                index=j;
                break;
            }
        }
        int leftSize = index-instart;
        root.left = construct(instart, index-1, inorder, poststart, poststart+leftSize-1, postorder);
        root.right= construct(index+1, inend, inorder, poststart+leftSize, postend-1, postorder);
        return root;
    
    }
    

}