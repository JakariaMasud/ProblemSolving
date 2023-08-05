class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Set<ListNode> nodeVisited = new HashSet<>();
        while (head.next != null) {
            if (nodeVisited.contains(head)) {
                return true;
            } else {
                nodeVisited.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
