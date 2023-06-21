    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode dummy = head;
        ListNode slowPtr = dummy;
        ListNode fastPtr = dummy;
        while (fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        slowPtr.next = reverseList(slowPtr.next);
        slowPtr = slowPtr.next;
        while (slowPtr != null) {
            if (dummy.val != slowPtr.val) {
                return false;
            } else {
                slowPtr = slowPtr.next;
                dummy = dummy.next;
            }
        }

        return true;
    }
