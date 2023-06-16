    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode fastPtr = start;
        ListNode slowPtr = start;

        for (int i = 1; i <= n; i++) {
            fastPtr = fastPtr.next;
        }
        while (fastPtr.next != null) {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = slowPtr.next.next;
        return start.next;

    }
