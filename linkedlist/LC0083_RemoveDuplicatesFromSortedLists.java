package linkedlist;

public class LC0083_RemoveDuplicatesFromSortedLists {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } 
            else {
                curr = curr.next;
            }
        }

        return head;
    }
}
//approach: one pointer, just compare now value, to the next value and if its the same then skip the next value and move on to the next and in case its not the same, just move like normal