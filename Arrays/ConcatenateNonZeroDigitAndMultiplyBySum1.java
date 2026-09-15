class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long num = 0;
        long rev = 0;
        while(n>0) {
            long digit = n%10;
            if(digit!=0) {
                sum+=digit;
                num = num*10 + digit;
            }
            n=n/10; 
        }
        if(num>0) {
            while(num>0) {
                long c = num%10;
                rev = rev*10+c;
                num=num/10;
            }
        }
        long ans = rev * sum;
        return ans;
    }
}