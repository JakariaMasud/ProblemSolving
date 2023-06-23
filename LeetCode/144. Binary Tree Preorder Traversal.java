class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        if (root == null) return result;
        treeStack.push(root);
        while (!treeStack.isEmpty()) {
            TreeNode temp = treeStack.pop();
            result.add(temp.val);
            if (temp.right != null) {
                treeStack.push(temp.right);
            }
            if (temp.left != null) {
                treeStack.push(temp.left);
            }
        }
        return result;
    }
}