class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null || head.next==null ) {
        return null;
       }
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp = prev;
        if(n==1) { 
            temp = temp.next;
        }
        else {
        for(int i=1;i<n-1;i++) {
            prev = prev.next;
        }
        }
        if(prev.next!=null) {
            prev.next = prev.next.next;
        }
        ListNode p = null;
        ListNode c = temp;
        while(c!=null) {
            ListNode f = c.next;
            c.next = p;
            p=c;
            c=f;
        }
        return p;


    }
}