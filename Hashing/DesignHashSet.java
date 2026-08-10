class MyHashSet {
ArrayList<Integer> list;
    public MyHashSet() {
        list = new ArrayList<>();
    }
    
    public void add(int key) {
        list.add(key);
    }
    
    public void remove(int key) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==key) {
                list.remove(list.get(i));
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==key) {
                return true;
            }
        }
        return false;
    }
}
