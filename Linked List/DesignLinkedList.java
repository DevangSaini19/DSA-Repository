class Node {
    int val;
    Node prev;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class MyLinkedList {
    Node head;
    Node tail;
    int size=0;
    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
        if(index<0 || index>=size) {
            return -1;
        }
        else {
            Node temp = head;
            for(int i=0;i<index;i++) {
                temp = temp.next;
            }
            return temp.val;
        }
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
            tail = newNode;
            head.next = null;
        }
        else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
            tail = newNode;
        }
        else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if(index < 0 || index > size) {
        return;
        }
        if(index==0) {
            addAtHead(val);
            return;
        }
        if(index==size) {
        addAtTail(val); 
        return;
        }
        else {
        Node temp = head;
        for(int i=0;i<index-1;i++) {
        temp = temp.next;
        }
        Node q = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = q;
        q.prev = newNode;
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
    if(index < 0 || index >= size) {
        return;
    }
    if(size == 1) {
        head = null;
        tail = null;
        size--;
        return;
    }
    if(index == 0) {
        head = head.next;
        head.prev = null;
        size--;
        return;
    }
    if(index == size - 1) {
        tail = tail.prev;
        tail.next = null;
        size--;
        return;
    }
    Node temp = head;
    for(int i = 0; i < index; i++) {
        temp = temp.next;
    }
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;

    size--;
}
}
