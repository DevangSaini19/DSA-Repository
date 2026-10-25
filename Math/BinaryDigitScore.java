class Solution {
    public int calculateScore(int a, int b) {
        String c = binary(a);
        String d = binary(b);
        int s1 = 0;
        int s2 = 0;
        for(int i=0;i<c.length();i++) {
            if(c.charAt(i)=='1') {
                s1++;
            }
        }
        for(int i=0;i<d.length();i++) {
            if(d.charAt(i)=='1') {
                s2++;
            }
        }
        int ans = 0;
        if(s1>=s2) {
            ans = s1 * s2;
        }
        else {
            ans = s2/s1;
        }
        return ans;
    }
    public String binary(int n) {
        String num = "";
        if(n==0) {
            return num;
        }
        while(n>0) {
            int digit = n % 2;
            num+=digit;
            n = n/2;
        }
        return num;
    }
}