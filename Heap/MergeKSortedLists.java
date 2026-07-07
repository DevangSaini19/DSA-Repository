//Brute Force
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         if(lists==null) {
//             return null;
//         }
//         List<Integer> list = new ArrayList<>();
//         for(int i=0;i<lists.length;i++) {
//             ListNode temp = lists[i];
//             while(temp!=null) {
//                 list.add(temp.val);
//                 temp = temp.next;
//             }
//         }
//         Collections.sort(list);
//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         for(int i=0;i<list.size();i++) {
//             ListNode newNode = new ListNode(list.get(i));
//             curr.next = newNode;
//             curr = newNode;
//         }
//         return dummy.next;
//     }
// }
class Solution { //Optimized Solution Using Min Heap
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null) {
            return null;
        }
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)-> a.val - b.val);
        for(int i=0;i<lists.length;i++) {
            if(lists[i]!=null) {
            q.offer(lists[i]);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!q.isEmpty()) {
            ListNode temp = q.poll();
            if(temp.next!=null) {
                q.offer(temp.next);
            }
            curr.next = temp;
            curr = temp;
        }
        return dummy.next;
    }
}