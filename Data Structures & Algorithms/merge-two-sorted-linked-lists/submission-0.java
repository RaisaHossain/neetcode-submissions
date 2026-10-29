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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = list1;
        ListNode curr2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode mList = dummy;
        while (curr != null && curr2 != null)
        {
            if (curr.val >= curr2.val)
            {
                mList.next = curr2;
                curr2 = curr2.next;
            }
            else if(curr.val < curr2.val)
            {
                mList.next = curr;
                curr = curr.next;
            }
            mList = mList.next;
        }
        if(curr != null)
        {
            mList.next = curr;
        }
        else
        {
            mList.next = curr2;
        }
        return dummy.next;
    }
}