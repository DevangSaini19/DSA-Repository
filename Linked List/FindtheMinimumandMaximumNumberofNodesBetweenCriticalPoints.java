class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> critical = new ArrayList<>();
        int[] arr = {-1,-1};
        ListNode temp = head;
        while(temp!=null) {
            list.add(temp.val);
            temp = temp.next;
        }
        for(int i=1;i<list.size()-1;i++) {
            if(list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1) || list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1)) {
                critical.add(i);
            } 
        }
        if(critical.size()<2) {
            return arr;
        }
        int minDistance = Integer.MAX_VALUE;
        for(int i = 1; i < critical.size(); i++) {
            minDistance = Math.min(minDistance,critical.get(i) - critical.get(i - 1));
        }
        int maxDistance =critical.get(critical.size() - 1) - critical.get(0);
        return new int[]{minDistance,maxDistance};
        
    }
}