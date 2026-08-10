class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        while(temp!=null) {
            if(set.contains(temp.val) || dup.contains(temp.val)) {
                set.remove(temp.val);
                dup.add(temp.val);
            }
            else {
                set.add(temp.val);
            }
            temp = temp.next;
        }
        List<Integer> list = new ArrayList<>();
            for(int i : set) {
                list.add(i);
            }
        Collections.sort(list);
        for(int i=0;i<list.size();i++) {
            ListNode newNode = new ListNode(list.get(i));
            curr.next = newNode;
            curr = newNode;
        }
        return dummy.next;
    }
}