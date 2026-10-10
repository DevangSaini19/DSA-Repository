class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=1;i<=num;i++) {
            int a = i;
            int sum = 0;
            while(a>0) {
                int digit = a % 10;
                sum+=digit;
                a = a/10;
            }
            if(sum%2==0) {
                count++;
            }
        }
        return count;
    }
}