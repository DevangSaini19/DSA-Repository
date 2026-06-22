class MyCircularDeque {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
    Node front;
    Node rear;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
    capacity = k;
    size = 0;
    front = null;
    rear = null;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if(isEmpty()) {
        front = newNode;
        rear = newNode;
        size++;
        return true;
        }
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
        size++;
        return true;

    }
    
    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if(isEmpty()) {
        front = newNode;
        rear = newNode;
        size++;
        return true;
        }
        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }
        if(size==1) {
            front = null;
            rear = null;
            size--;
            return true;
        }
        front = front.next;
        front.prev = null;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        if(size==1) {
            front = null;
            rear = null;
            size--;
            return true;
        }
        rear = rear.prev;
        rear.next = null;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return front.val;
    }
    
    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return rear.val;
    }
    
    public boolean isEmpty() {
        if(size==0) {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

