/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 0;
        for (ListNode a = headA; a != null; a = a.next) {
            aLength++;
        }

        int bLength = 0;
        for (ListNode b = headB; b != null; b = b.next) {
            bLength++;
        }


        ListNode aNode = headA;
        ListNode bNode = headB;
        int minLength = aLength;

        if (aLength > bLength) {
            for (int i = 0; i < aLength - bLength; i++) {
                aNode = aNode.next;
            }
            minLength = bLength;
        }

        if (bLength > aLength) {
            for (int i = 0; i < bLength - aLength; i++) {
                bNode = bNode.next;
            }
        }

        for (int i = 0; i < minLength; i++) {
            if (aNode == bNode) {
                return aNode;
            }
            aNode = aNode.next;
            bNode = bNode.next;
        }

        return null;
    }
}