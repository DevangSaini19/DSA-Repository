class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set = new HashSet<>();
    int l = 0;
    int r = 0;
    int count = 0;
    while(r<s.length()) {
        if(!set.contains(s.charAt(r))) {
            set.add(s.charAt(r));
            int a = set.size();
            count = Math.max(a,count);
            r++;
        }
        else {
            set.remove(s.charAt(l));
            l++;
        }
    }
    return count;
    }
}