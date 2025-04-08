class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        postTraverse(root, postorder);
        return postorder;
    }

    void postTraverse(TreeNode node, List<Integer> list) {
        if (node == null) return;

        postTraverse(node.left, list);   
        postTraverse(node.right, list);  
        list.add(node.val);              
    }
}
