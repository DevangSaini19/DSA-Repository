class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i=0;i<words.length;i++) {
            String s = words[i];
            if(isPalindrome(s)) {
                return s;
            }  
        }
        return ans;
    }
    public boolean isPalindrome(String a) {
        int left = 0;
        int right = a.length()-1;
        while(left<=right) {
            if(a.charAt(left)!=a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}