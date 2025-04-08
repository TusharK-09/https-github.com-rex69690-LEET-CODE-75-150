class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        traverseNode(root, preorder);
        return preorder;
    }

    private void traverseNode(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.val);                
        traverseNode(node.left, list);  
        traverseNode(node.right, list);  
    }
}
