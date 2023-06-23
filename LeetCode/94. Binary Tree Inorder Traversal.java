class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        TreeNode temp = root;
        Stack<TreeNode> treeStack = new Stack<>();
        while (!treeStack.isEmpty() || temp != null) {
            if (temp != null) {
                treeStack.push(temp);
                temp = temp.left;
            } else {
                temp = treeStack.pop();
                result.add(temp.val);
                temp = temp.right;

            }
        }
        return result;

    }
}