public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        ListNode first = fast;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }
