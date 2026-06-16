class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) {
        return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        ListNode dummy1 = new ListNode(0);
        ListNode q = dummy1;
        ListNode temp = head;
        while(temp!=null) {
            ListNode a = temp.next;
            if(temp.val<x) {
            p.next = temp;
            temp.next = null;
            p = temp;
            temp = a;   
        }
            else if(temp.val>=x) {
            q.next = temp;
            temp.next =null;
            q = temp;
            temp = a; 
        }
            else {
            temp = temp.next;
        }
     }
        p.next = dummy1.next;
        return dummy.next;   
    }
}
