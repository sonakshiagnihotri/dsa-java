package linkedlist;

public class LC0876_MiddleOfALinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}