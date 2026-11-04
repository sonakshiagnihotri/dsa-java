package linkedlist;
public class LC0206_ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode currp1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currp1;
        }
        head=prev;
        return head;
    }
}

//me could never understand this, me will mug it up <333