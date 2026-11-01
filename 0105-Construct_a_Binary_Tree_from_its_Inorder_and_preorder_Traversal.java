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
   
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int prestart =0, preend = preorder.length-1, instart = 0, inend = inorder.length-1;
        TreeNode mainRoot = construct(preorder,prestart, preend, inorder, instart, inend);
        return mainRoot;
    }
    TreeNode construct(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend){
       if(prestart>preend){
        return null;
       }
        TreeNode root =new  TreeNode(preorder[prestart]);
        int index=-1;
        int temp = root.val;
        for(int j = instart;j<=inend;j++){
            if(temp==inorder[j]){
                index = j;
                break;
            }
        }     
        root.left = construct(preorder, prestart+1, prestart+(index-instart), inorder, instart, index-1);
        root.right = construct(preorder,prestart+(index-instart)+1, preend, inorder, index+1, inend);
        return root;
    }
}