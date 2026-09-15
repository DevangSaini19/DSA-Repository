class Solution {
    public double minimumAverage(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Double> average = new ArrayList<>(); 
        int n = nums.length/2;
        for(int i=0;i<nums.length;i++) {
            list.add(nums[i]);
        }
        while(n>0) {
            int max = list.get(0);
            int min = list.get(0);
            for(int i=0;i<list.size();i++) {
                if(list.get(i)>max) {
                    max = list.get(i);
                }
                if(list.get(i)<min) {
                    min = list.get(i);
                }
            }
            double avg = (double)(max + min)/2.0;
            average.add(avg);
            list.remove(Integer.valueOf(max));
            list.remove(Integer.valueOf(min));
            n--;
        }
        double minAvg = average.get(0);
        for(int i=0;i<average.size();i++) {
            if(average.get(i)<minAvg) {
                minAvg = average.get(i);
            }
        }
        return minAvg;
    }
    
}