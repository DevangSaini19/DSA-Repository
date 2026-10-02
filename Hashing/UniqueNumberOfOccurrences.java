class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++) {
        if(map.containsKey(arr[i])) {
            map.put(arr[i],map.get(arr[i])+1);
        }
        else {
            map.put(arr[i],1);
        }
    }
    int[] ans = new int[map.size()];
    int index = 0;
    for(Map.Entry<Integer,Integer> e : map.entrySet()) {
        ans[index++] = e.getValue();
    }
    for(int i=0;i<ans.length;i++) {
        for(int j=i+1;j<ans.length;j++) {
            if(ans[i]==ans[j]) {
                return false;
            }
        }
    }
    return true;
    }
}