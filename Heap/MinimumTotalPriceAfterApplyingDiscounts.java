class Solution {
    public double minPrice(int[] prices, int[] discounts) {
    PriorityQueue<Integer> price = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> discount = new PriorityQueue<>(Collections.reverseOrder());
        double ans = 0;
        for(int i=0;i<prices.length;i++) {
            price.offer(prices[i]);
        }
        for(int i=0;i<discounts.length;i++) {
            discount.offer(discounts[i]);
        }
        while(!discount.isEmpty() && !price.isEmpty()) {
            double t1 = (double)price.poll();
            double t2 = (double)discount.poll();
            double sum = (t1 * (100 - t2))/100.0;
            ans += sum;
            
        }
        while(!price.isEmpty()) {
            ans +=price.poll();
        }
        return ans;
    }
}