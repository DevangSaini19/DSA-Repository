class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = temp;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode p = head;
        ListNode q = prev;
        while(p!=null && q!=null) {
           ListNode b = p.next;
           ListNode c = q.next;
           p.next = q;
           q.next = b;
           p = b;
           q =c;
        }
    }
}
