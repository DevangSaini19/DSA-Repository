class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int i = 0;
        int j = 0;
        List<List<Integer>> list = new ArrayList<>();
        while(i<series1.length && j<series2.length) {
            List<Integer> list1 = new ArrayList<>();
            int t1 = series1[i][0];
            int v1 = series1[i][1];
            int t2 = series2[j][0];
            int v2 = series2[j][1];
            if(t1==t2) {
                list1.add(t1);
                list1.add(v1+v2);
                list.add(list1);
                i++;
                j++;
            }
            else if(t1<t2) {
                list1.add(t1);
                list1.add(v1+v2);
                list.add(list1);
                i++;
            }
            else {
                list1.add(t2);
                list1.add(v1+v2);
                list.add(list1);
                j++;
            }  
        }
        while(i<series1.length) {
        List<Integer> list2 = new ArrayList<>();
            list2.add(series1[i][0]);
            list2.add(series1[i][1]);
            list.add(list2);
            i++;
        }
        while(j<series2.length) {
        List<Integer> list3 = new ArrayList<>();
            list3.add(series2[j][0]);
            list3.add(series2[j][1]);
            list.add(list3);
            j++;
        }
        
        return list;
    }
}