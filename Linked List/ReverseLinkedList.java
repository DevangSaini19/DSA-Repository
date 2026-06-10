class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = curr.next;
        while(curr!=null) {
            curr.next = prev;
            prev = curr;
            curr = Next;
            if(Next!=null) {
                Next = Next.next;
            }
        }
        return prev;

       
    }
}