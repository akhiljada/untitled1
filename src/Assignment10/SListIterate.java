package Assignment10;

public class SListIterate {
    Node temp;
    SListIterate(Node node){
        this.temp = node;
    }
    public Node next() {
        temp = temp.next;
        return temp;
    }
    public boolean hasNext() {
        return temp.next!=null;
    }
    public void insertNode(String data) {
        temp.next = new Node(data, temp.next);
        temp = temp.next;
    }
    public void removeNode() {
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}
