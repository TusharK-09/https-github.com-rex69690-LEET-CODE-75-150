class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        
        
        if (root == null) {
            return preorder;
        }
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while (!st.isEmpty()) {
            TreeNode current = st.peek();
            st.pop();
            preorder.add(current.val);
            
           
            if (current.right != null) {
                st.push(current.right);
            }
            
            if (current.left != null) {
                st.push(current.left);
            }
        }
        
        return preorder;
    }
}