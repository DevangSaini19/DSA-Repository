class Solution {
    public int smallestNumber(int n, int t) {
        int current = n;
        while(current<=100) {
            int product = 1;
            int temp = current;
            while(temp!=0) {
                int digit = temp % 10;
                product *= digit;
                temp= temp/10;
            }
            if(product%t==0) {
                return current;
            }
            current++;
        }
        return -1;
    }
}