class Solution {
    public boolean isPalindrome(String s) {
        String ans = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = ans.length() - 1;

        while (left < right) {
            if (ans.charAt(left) != ans.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}