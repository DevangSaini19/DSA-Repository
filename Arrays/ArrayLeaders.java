class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]==max) {
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
