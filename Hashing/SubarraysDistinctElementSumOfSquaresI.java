class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=i;j<nums.size();j++){
                temp.add(nums.get(j));
                list.add(new ArrayList<>(temp));
            }
        }

        for(ArrayList<Integer> arr : list){
            HashMap<Integer,Integer> map = new HashMap<>();
            int count = 0;
            int i = 0;
            for(int t : arr){
                if(!map.containsKey(t))
                    map.put(t,i++);
            }
            ans += (map.size()*map.size());
        }
        return ans;
    }
}