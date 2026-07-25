class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        while(n>0) {
            int digit = n % 10;
            q.offer(digit);
            n = n/10;
        }
        int first = q.poll();
        int second = 1;
        if(!q.isEmpty()) {
            second = q.poll();
        }
        return first * second;
    }
}