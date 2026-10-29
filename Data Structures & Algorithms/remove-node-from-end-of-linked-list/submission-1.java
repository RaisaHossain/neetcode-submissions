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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Calculate the size of the list
        int size = 0;
        ListNode tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        
        // Determine the position of the node to remove from the start
        int posFromStart = size - n;
        
        // Edge case: removing the head
        if (posFromStart == 0) {
            return head.next;
        }
        
        // Traverse to the node just before the target node
        ListNode curr = head;
        for (int i = 0; i < posFromStart - 1; i++) {
            curr = curr.next;
        }
        
        // Remove the target node
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
        
        return head;
    }
}

