class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        k = k%count;
        ListNode tail = head;
        while(tail.next!=null) {
            tail = tail.next;
        }
        tail.next = head;
        int length = count - k;
        for(int i=0;i<length;i++) {
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;

    }
}
