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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inTraverse(root , inorder);
        return inorder;
    }

    void inTraverse(TreeNode root ,List<Integer> list){
        if(root == null) return;

        inTraverse(root.left , list);
        list.add(root.val);
        inTraverse(root.right , list);
    }
}