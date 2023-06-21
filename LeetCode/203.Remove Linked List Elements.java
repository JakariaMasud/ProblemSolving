    public ListNode removeElements(ListNode head, int value) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1, head);
        ListNode nextPtr;
        ListNode current = dummy;
        while (current != null && current.next != null) {
            if (current.next.val == value) {
                nextPtr = current.next;
                current.next = nextPtr.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }