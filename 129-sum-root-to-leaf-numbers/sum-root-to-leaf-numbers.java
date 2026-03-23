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
class Solution{
    public int sumNumbers(TreeNode root) {
       int sum = 0;
       sum = sumNo( root,sum);
       return sum;
 }
    public int sumNo(TreeNode root , int value){
     if(root == null){
        return 0;
     }
    value = value *10 + root.val;
    if(root.left == null && root.right == null){
        return value;

    }
    return sumNo(root.right , value) + sumNo(root.left , value);
     
   
    }
}