class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int carry = 0;
        ListNode temp = prev;
        ListNode p = null;
        while(temp!=null) {
            p = temp;
            int x = temp.val * 2 + carry;
            if(x>=10) {
                carry = 1;
                temp.val = x % 10;
            }
            else {
                carry = 0;
                temp.val = x;
            }
            temp = temp.next;
        }
        if(carry == 1){
        p.next = new ListNode(1);
        }

        ListNode a = prev;
        ListNode q = null;
        while(a!=null) {
            ListNode c = a.next;
            a.next = q;
            q = a;
            a = c;
        }
        return q;
        
    }
}