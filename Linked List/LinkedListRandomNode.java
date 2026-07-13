class Solution {
    ListNode head;
    int n;
    public Solution(ListNode head) {
        this.head = head;
        this.n = Count(head);
    }
    public int Count(ListNode head) {
        ListNode t = head;
        int count = 0;
        while(t!=null) {
            count++;
            t = t.next;
        }
        return count;
    }
    
    public int getRandom() {
        Random random = new Random(); 
        int index = random.nextInt(n);
        ListNode temp = head;
        for(int i=0;i<index;i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}
