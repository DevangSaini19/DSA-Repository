//Approach2 
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
         return true;
        }
       ListNode temp = head;
       int count = 0;
       while(temp!=null) {
        count++;
        temp = temp.next;
       }
       ListNode temp1 = head;
       if(count%2==0) {
        for(int i=0;i<count/2;i++) {
            temp1 = temp1.next;
        }
       }
       else {
        for(int j=0;j<(count/2)+1;j++) {
            temp1 = temp1.next;
        }
       }
       ListNode prev = null;
       ListNode curr = temp1;
       
       while(curr!=null) {
        ListNode Next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = Next;
       }
       ListNode p = prev;
       ListNode q = head;
       while(p!=null && q!=null) {
        if(p.val!=q.val) {
            return false;
        }
        p = p.next;
        q = q.next;
       }
       return true;
    }
}