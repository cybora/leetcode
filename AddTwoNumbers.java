/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultStart = null;
        ListNode resultEnd = null;
        int carry = 0;
        for(ListNode node1 = l1, node2 = l2; node1 != null || node2 != null; node1 = node1 != null ? node1.next: null, node2 = node2 != null ? node2.next : null) {
            int val1 = node1 != null ? node1.val : 0;
            int val2 = node2 != null ? node2.val : 0;
            int total = val1 + val2 + carry;
            carry = 0;
            if (total >= 10) {
                total %= 10;
                carry = 1;
            }
            ListNode totalNode = new ListNode(total);
            if (resultStart == null) {
                resultStart = totalNode;
            } else {
                if (resultStart.next == null) {
                    resultStart.next = totalNode;
                    resultEnd = totalNode;
                } else {
                    resultEnd.next = totalNode;
                    resultEnd = resultEnd.next;
                }
            }
        }
        if (carry == 1) {
            if (resultStart.next == null) {
                resultStart.next = new ListNode(1);
            } else {
                resultEnd.next = new ListNode(1);
            }
        }
        return resultStart;
    }
}