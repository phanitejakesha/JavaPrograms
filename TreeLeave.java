/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            // System.out.println(root.left.val);
            if(root.left.left == null && root.left.right==null){
                return sumOfLeftLeaves(root.left) +sumOfLeftLeaves(root.right) +  root.left.val;
            }
            else{
                 return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
            }
            
        }
        else{
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
    }
}
