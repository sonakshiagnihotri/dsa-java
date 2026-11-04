package linkedlist;
    public class LC0082_RemoveDuplicatesFromSortedListsII {
        public ListNode deleteDuplicates(ListNode head) {
            // ListNode curr= head;
            // while(curr!=null && curr.next!=null){
            //     if(curr.val==curr.next.val){
            //         // curr.next=curr.next.next;
            //         head=head.next;
            //     }
            //     break;
            //     ListNode Newcurr=head.next; 
            //     if(Newcurr.val==Newcurr.next.val){
            //         Newcurr.next=Newcurr.next.next;
            //     }
            //     curr=curr.next;
            // }
            // return head;
            if(head==null || head.next==null)return head;
            ListNode dummy=new ListNode(0,head);
            dummy.next=head;
            ListNode prev=dummy;
            ListNode curr=head;
            while(curr!=null){
                if(curr.next!=null && curr.val==curr.next.val  ){
                    curr=curr.next;
                    
                }
                else{
                    if(prev.next==curr){
                        prev=curr;
                    }else {prev.next=curr.next;}

                    curr=curr.next;
                }
            
            }
            return dummy.next;
        }
    }