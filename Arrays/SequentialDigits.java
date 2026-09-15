class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String c = "123456789";
        int min = count(low);
        int max = count(high);
        for(int i=min;i<=max;i++) {
            for(int j=0;j<=c.length()-i;j++) {
            String s = c.substring(j,j+i);
            int n = Integer.parseInt(s);
            if(n>=low && n<=high) {
                list.add(n);
            } 
            }
        }
        return list;

    }
    public int count(int num) {
        int count = 0;
        while(num>0) {
        int digit = num%10;
        count++;
        num = num/10;
        }
        return count;
        
    }
}