class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode p = head;
        ListNode q = head.next;
        while(p!=null && q!=null) {
            ListNode a = q.next;
            curr.next = q;
            q.next = p;
            p.next = a;
            curr = p;
            p = p.next;
            if(p!=null) {
            q = p.next; 
            }
           
        }
        
        return dummy.next;
        
        
    }
}
