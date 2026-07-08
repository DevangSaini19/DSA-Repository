class Solution {
    class Pair {
    int val;      
    int listIndex;  
    int elementIndex; 
    public Pair(int val,int listIndex,int elementIndex) {
        this.val = val;
        this.listIndex = listIndex;
        this.elementIndex = elementIndex;
    }
}
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)-> a.val - b.val);
        int currentMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++) {
            int a = nums.get(i).get(0);
            Pair p = new Pair(a,i,0);
            q.offer(p);
            currentMax = Math.max(currentMax,a);
        }
        int r = q.peek().val;
        int s = currentMax;
        while(!q.isEmpty()) {
            Pair c = q.poll();
            if(nums.get(c.listIndex).size()>c.elementIndex + 1) {
                int nextValue = nums.get(c.listIndex).get(c.elementIndex + 1);
                currentMax = Math.max(currentMax, nextValue);
                Pair next = new Pair(nextValue,c.listIndex,c.elementIndex+1);
                q.offer(next);
                int currentLeft = q.peek().val;
                int currentRight = currentMax;
                if (currentRight - currentLeft < s - r) {
                    s = currentRight;
                    r = currentLeft;
                }
                else if (currentRight - currentLeft == s - r && currentLeft < r) {
                    r = currentLeft;
                    s = currentRight;
                }  
            }
            else {
                    break;
                }
        }
        return new int[]{r, s};

    }
}