class Node {
    String url;
    Node next;
    Node prev;

public Node(String url) {
    this.url = url;
    this.next = null;
    this.prev = null;
    }
}
class BrowserHistory {
    Node head;
    Node tail;
    Node curr;
    public BrowserHistory(String homepage) {
        Node newNode = new Node(homepage);
        head = newNode;
        tail = newNode;
        curr = newNode;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;
        tail = newNode;
        if(tail!=curr) {
        while(tail!=curr) {
            tail = tail.prev;
        }
        tail.next = null;
        }
    }
    
    public String back(int steps) {
        for(int i=0;i<steps && curr.prev!=null;i++) {
            curr = curr.prev;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps && curr.next!=null;i++) {
            curr = curr.next;
        }
        return curr.url;
    }
    
}
