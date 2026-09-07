class RandomizedSet {
    HashSet<Integer> set;
    ArrayList<Integer> list;
    Random random;
    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)) {
            return false;
        }
        else {
            set.add(val);
            list.add(val);
        }
        return true;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)) {
            set.remove(val);
            list.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
    Random random = new Random();
    int index = random.nextInt(list.size());
    return list.get(index);
    }
}