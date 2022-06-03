package Assignment10;

public class SListDemo {
    public static void main(String[] args) {
        SList sList1 = new SList();
        SListIterate sListIterator1 = sList1.iterateList();
        System.out.print(sList1);

        sListIterator1.insertNode("Hello");
        sListIterator1.insertNode("Everyone");
        System.out.println(sList1);

        SListIterate sListIterator2 = sList1.iterateList();
        sListIterator2.removeNode();
        System.out.println(sList1);

        sListIterator2.insertNode("Hello");
        sListIterator2.insertNode("Zorros");
        sListIterator2.removeNode();
        System.out.println(sList1);
    }
}
