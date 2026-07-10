class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long answer = -1;
        while(low<=high) {
            long mid = low + (high-low)/2;
            long ans = mid * mid;
            if(ans==x) {
                return (int) mid;
            }
            else if(ans<x) {
                answer = (int)mid;
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return (int)answer;
    }
}