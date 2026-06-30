class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null ) {
            return null;
        }
        if(head.next==null && left==1 && right==1) {
            return head;
        }
        if(left==right) {
            return head;
        }
        ListNode temp = head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int s=0;s<left-2;s++) {
            temp2 = temp2.next;
        }
        for(int i=0;i<left-1;i++) {
            temp = temp.next;
        }
        for(int j=0;j<right-1;j++) {
            temp1 = temp1.next;
        }
        ListNode a = temp1.next;
        temp1.next = null;
        ListNode prev = null;
        ListNode curr = temp;
        while(curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(left==1) {
            head = prev;
        }
        else {
        temp2.next = prev;
        }
        ListNode b = prev;
        while(b.next!=null) {
            b = b.next;
        }
        b.next = a;
        return head;
        
    }
}