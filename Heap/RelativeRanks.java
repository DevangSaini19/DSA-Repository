class Solution {
    public String[] findRelativeRanks(int[] score) {
    PriorityQueue<int[]> q =new PriorityQueue<>((a,b) -> b[0]- a[0]);
    for(int i=0;i<score.length;i++) {
        q.offer(new int[]{score[i],i});
    }
    String[] arr = new String[score.length];
    int count = 0;
    while(!q.isEmpty()) {
        int[] p = q.poll();
        if(count==0) {
            arr[p[1]] = "Gold Medal";
        }
        else if(count==1) {
            arr[p[1]] = "Silver Medal";
        }
        else if(count==2) {
            arr[p[1]] = "Bronze Medal";
        }
        else {
            arr[p[1]] = String.valueOf(count + 1);
        }
        count++;
    }
    return arr;
    }
}