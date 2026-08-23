class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            ans.append(binary(s.charAt(i)));
        }
        int left = 0;
        int right = ans.length() - 1;
        while(left<right) {
            if(ans.charAt(left)!=ans.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String binary(char s) {
        int ch = (int) s;
        String sum = "";
        int i =0;
        while(i<8) {
            int r = ch % 2;
            sum = r + sum;
            ch = ch/2;
            i++;
        }
        return sum;
    }
}