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
import java.util.Arrays;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<level;i++){    
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                sublist.add(q.poll().val);
            }
            if(flag==true){
                list.add(sublist);
                flag=false;
            }
            else{
                Collections.reverse(sublist);
                list.add(sublist);
                flag=true;
            }
                
        }              
       return list;
    }
}