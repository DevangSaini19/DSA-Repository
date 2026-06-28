class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) {
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        ListNode temp1 = head;
        for(int i=0;i<(count/2)-1;i++) {
            temp1 = temp1.next;
        }
        if(temp1.next!=null) {
            temp1.next = temp1.next.next;
        }
        return head;
    }
}