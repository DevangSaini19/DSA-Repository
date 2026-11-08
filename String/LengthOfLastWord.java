class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String[] arr = s.split(" ");
        String ans = arr[arr.length-1];
        for(int i=0;i<ans.length();i++) {
            count++;
        }
        return count;
    }
}