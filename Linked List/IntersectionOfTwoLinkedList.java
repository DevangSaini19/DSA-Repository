public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        int count = 0;
        int count1 = 0;
        int diff = 0;
        while(p!=null) {
          count++;
          p = p.next;
        }
        while(q!=null) {
            count1++;
            q = q.next;
        }
        ListNode a = headA;
        ListNode b = headB;
        if(count>count1) {
            diff = count - count1;
            for(int i=0;i<diff;i++) {
                a = a.next;
            }
        }
            else {
            diff = count1 - count;
            for(int i=0;i<diff;i++) {
                b= b.next;
            }
        }
        while(a!=null && b!=null) {
            if(a==b) {
                return a;
            }
            else {
                a = a.next;
                b = b.next;
            }
        }
        return null;
    }
} 
