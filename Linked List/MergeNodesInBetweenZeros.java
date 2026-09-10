class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode curr = head.next;
        int sum = 0;
        while(curr!=null){
            if(curr.val != 0){
                sum += curr.val;
            }else{
                ListNode temp = new ListNode(sum);
                ans.next = temp;
                ans = temp;
                sum = 0;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}