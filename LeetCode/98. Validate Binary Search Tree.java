class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode pre = null;
        if (root == null) return true;
        TreeNode temp = root;
        Stack<TreeNode> treeStack = new Stack<>();
        while (!treeStack.isEmpty() || temp != null) {
            if (temp != null) {
                treeStack.push(temp);
                temp = temp.left;
            } else {
                temp = treeStack.pop();
                if (pre != null && temp.val <= pre.val) return false;
                pre = temp;
                temp = temp.right;
            }
        }
        return true;
    }
}
