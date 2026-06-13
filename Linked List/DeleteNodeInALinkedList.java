public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        ListNode temp1 = node;
      while(node.next!=null) {
        int temp = node.val;
        node.val = node.next.val;
        node.next.val = temp;
        node = node.next;
      }
      while(temp1.next!=node) {
        temp1 = temp1.next;
      }
      temp1.next = null;
      
    }
}
