class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode k = dummy;
        ListNode curr = l1;
        ListNode prev = null;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode curr1 = l2;
        ListNode prev1 = null;
        while(curr1!=null) {
            ListNode next1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }
        ListNode p = prev;
        ListNode q = prev1;
        int carry = 0;
        while(p!=null || q!=null || carry!=0) {
            int x = 0;
            int y = 0;
            if(p!=null) {
                x = p.val;
                p = p.next;
            }
            if(q!=null) {
                y = q.val;
                q = q.next;
            }
            int sum = x + y + carry;
            int digit = sum % 10;
            carry = sum/10;
            ListNode newNode = new ListNode(digit);
            k.next = newNode;
            k = newNode; 
        }
        ListNode w = dummy.next;
        ListNode s = null;
        while(w!=null) {
            ListNode x = w.next;
            w.next = s;
            s = w;
            w = x;
        }
        return s;
    }
}