class Solution {
    public String reverseVowels(String s) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            arr[i] = ch;
        }
        int left = 0;
        int right = arr.length - 1;
        while(left<=right) {
            if(!(arr[left]=='a' || arr[left]=='A' || arr[left]=='e'||arr[left]=='E'||arr[left]=='i'||arr[left]=='I'||arr[left]=='o'||arr[left]=='O'||arr[left]=='u'||arr[left]=='U')) {
                left++;
            }
            else if(!(arr[right]=='a' || arr[right]=='A' || arr[right]=='e'||arr[right]=='E'||arr[right]=='i'||arr[right]=='I'||arr[right]=='o'||arr[right]=='O'||arr[right]=='u'||arr[right]=='U')) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}