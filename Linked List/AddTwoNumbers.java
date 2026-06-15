class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp1 = l2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(temp!=null || temp1!=null || carry!=0) {
        int sum = carry;
        if(temp!= null) {
        sum += temp.val;
        temp = temp.next;
        }
        if(temp1 != null) {
        sum += temp1.val;
        temp1 = temp1.next; 
        } 
        int digit = sum % 10;
        carry = sum / 10;
        ListNode newNode = new ListNode(digit);
        curr.next = newNode;
        curr = newNode;  
        }
        return dummy.next;
    }
}