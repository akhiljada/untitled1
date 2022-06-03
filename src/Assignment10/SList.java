package Assignment10;

public class SList {
    Node head = new Node(null);
    public SListIterate iterateList() {
        return new SListIterate(head);
    }
    public String toString() {
        if(head==null) {
            return "list is empty: ";
        }
        SListIterate iterator = this.iterateList();
        StringBuilder s=new StringBuilder();
        while (iterator.hasNext()) {
            s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
        }
        return ""+s;
    }
}
