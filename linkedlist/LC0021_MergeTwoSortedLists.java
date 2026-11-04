package linkedlist;
// LC 21 · https://leetcode.com/problems/merge-two-sorted-lists/
// Approach: dummy node, compare heads, attach the smaller one, move on
// Time O(n + m) · Space O(1)


// LC 21 - Merge Two Sorted Lists
// Approach: Dummy node + Two pointers
// Time: O(n + m)
// Space: O(1)

public class LC0021_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if (list1 == null) {
            curr.next = list2;
        } else {
            curr.next = list1;
        }

        return dummy.next;
    }
}

