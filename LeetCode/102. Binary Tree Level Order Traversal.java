class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.offer(root);
        while (!treeQueue.isEmpty()) {
            int levelSize = treeQueue.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 1; i <= levelSize; i++) {
                TreeNode temp = treeQueue.poll();
                sublist.add(temp.val);
                if (temp.left != null) treeQueue.offer(temp.left);
                if (temp.right != null) treeQueue.offer(temp.right);
            }
            result.add(sublist);
        }
        return result;
    }
}