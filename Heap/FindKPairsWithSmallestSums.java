class Solution {
    class Pair{
        int i;
        int j;
        int sum;
        public Pair(int i,int j, int sum) {
            this.i = i;
            this.j = j;
            this.sum = sum;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)-> a.sum - b.sum);
        for(int i=0;i<Math.min(k,nums1.length);i++) {
            int a = i;
            int b = 0;
            int Sum = nums1[a]+nums2[b];
            Pair p = new Pair(a,b,Sum);
            q.offer(p);
        }
            int count =0;
            while(!q.isEmpty() && count<k ) {
            List<Integer> list1 = new ArrayList<>();
            Pair p = q.poll();
            if(nums2.length > p.j + 1) {
                int Sum = nums1[p.i] + nums2[p.j+1];
                Pair c = new Pair(p.i,p.j+1,Sum);
                q.offer(c);
            }
            list1.add(nums1[p.i]);
            list1.add(nums2[p.j]);
            count++;
            list.add(list1);
            }
        return list;
    }
}