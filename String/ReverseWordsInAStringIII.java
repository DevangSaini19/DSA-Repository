class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String word : words) {
            list.add(word);
        }
        String ans = "";
        for(int i=0;i<list.size();i++) {
            String a = list.get(i);
            for(int j=a.length()-1;j>=0;j--) {
                ans = ans + a.charAt(j);
            }
            if(i != list.size()-1) {
                ans += " ";
            }
        }
        return ans;
    }
}