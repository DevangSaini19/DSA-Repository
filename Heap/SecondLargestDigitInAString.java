class Solution {
    public int secondHighest(String s) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                if(q.contains(ch - '0')) {
                    continue;
                }
                else {
                q.offer(ch -'0');
                }
            }
            if(q.size()>2) {
                q.poll();
            }
        }
        if (q.size() < 2) {
            return -1;
        }
        int b = -1;
        int c = -1;
        if(!q.isEmpty()) {
            b = q.poll();
        }
        if(!q.isEmpty()) {
            c = q.poll();
        }
        if(b==c) {
            return -1;
        }
        return b;
    }
}