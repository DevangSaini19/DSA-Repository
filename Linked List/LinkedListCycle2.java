public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) {
            return null;
        }
        ListNode i = head;
        ListNode j = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                j = slow;
                while(i!=j) {
                    i = i.next;
                    j = j.next;
                }
                return i;
            }
        }
        return null;
    }
} 
