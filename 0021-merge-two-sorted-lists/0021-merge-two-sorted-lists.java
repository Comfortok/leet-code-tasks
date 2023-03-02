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
        return merge(null, list1, list2);
    }
    
    private ListNode merge(ListNode current, ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return current;
        }

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current = new ListNode(list2.val);
                list2 = list2.next;
            }
        } else if (list2 != null) {
            current = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            current = new ListNode(list1.val);
            list1 = list1.next;
        }

        current.next = merge(current.next, list1, list2);

        return current;
    }
}