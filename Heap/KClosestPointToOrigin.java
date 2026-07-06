class Solution {
    class Pair{
        int x;
        int y;
        int distance;

        public Pair(int x,int y,int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->b.distance - a.distance);
        for(int i=0;i<points.length;i++) {
            int a = points[i][0];
            int b = points[i][1];
            int dist = a*a+b*b;
            Pair p = new Pair(a,b,dist);
            p.x = a;
            p.y = b;
            p.distance = dist;
            q.offer(p);
            if(q.size()>k) {
                q.poll();
            }
        }
        int arr[][] = new int[k][2];
        int c = 0;
        while(!q.isEmpty()) {
            Pair p = q.poll();
            arr[c][0] = p.x;
            arr[c][1] = p.y;
            c++;
        }
        return arr;
    }
}