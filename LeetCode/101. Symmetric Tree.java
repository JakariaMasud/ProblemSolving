class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.push(root.left);
        treeStack.push(root.right);
        while (!treeStack.isEmpty()) {
            TreeNode n1 = treeStack.pop();
            TreeNode n2 = treeStack.pop();
            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null || n1.val != n2.val) return false;
            treeStack.push(n1.left);
            treeStack.push(n2.right);
            treeStack.push(n1.right);
            treeStack.push(n2.left);
        }
        return true;
    }
}