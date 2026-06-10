class Solution {
    int getMiddle(Node head) {
        Node temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        Node temp1 = head;
        int index = count/2;
        for(int i=0;i<index;i++) {
            temp1 = temp1.next;
        }
        return temp1.data;
        
    }
}