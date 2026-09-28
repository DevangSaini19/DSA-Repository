class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=1;i<=2;i++) {
            int a = n * i;
            if(a%2==0) {
                return a;
            }
        }
        return -1;
    }
}