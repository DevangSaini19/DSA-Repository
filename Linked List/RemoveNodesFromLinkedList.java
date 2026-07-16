class Solution {
    public ListNode removeNodes(ListNode head) {
    ListNode temp = head;
    ListNode prev = null;
    while(temp!=null) {
        ListNode next = temp.next;
        temp.next = prev;
        prev = temp;
        temp = next;
    }
    ListNode p = prev;
    ListNode curr = p;
    ListNode q = p.next;
    while(q!=null) {
        if(q.val<curr.val) {
            curr.next = q.next;
            q = q.next;
        }
        else if (q.val>=curr.val) {
            curr = curr.next;
            q = q.next;
        }
    }
    ListNode a = prev;
    ListNode b = null;
    while(a!=null) {
        ListNode c = a.next;
        a.next = b;
        b = a;
        a = c;
    }
    return b;   
    }
}