class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        for(int i=0;i<a-1;i++) {
            temp = temp.next;
        }
        for(int j=0;j<b;j++) {
            temp1 = temp1.next;
        }
        ListNode p = temp1.next;
        temp.next = list2;
        while(temp2.next!=null) {
            temp2 = temp2.next;
        }
        temp2.next = p;
        return list1;

    }
}