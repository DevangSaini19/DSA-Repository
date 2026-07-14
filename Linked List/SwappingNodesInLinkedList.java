// Approach 1
// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         ListNode temp = head;
//         ListNode p = head;
//         ListNode q = head;
//         int count = 0;
//         while(temp!=null) {
//             count++;
//             temp = temp.next;
//         }
//         for(int i=0;i<k-1;i++) {
//             p = p.next;
//         }
//         int length = count - k + 1;
//         for(int j=0;j<length-1;j++) {
//             q = q.next;
//         }
//         int s = p.val;
//         p.val = q.val;
//         q.val = s;
//         return head;   
//     }
// }
class Solution { // Approach 2
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<k-1;i++) {
            fast = fast.next;
        }
        ListNode temp = fast;
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        int t = slow.val;
        slow.val = temp.val;
        temp.val = t;
        return head;    
    }
}