package yourname.assignment.singleton;
public class sb{
    String str;

    public sb(String s) {
        str=s;
    }

    public static void b(String s) {
        //static methods can access static variable
        sb sc = new sb(s);
    }
    public void print() {
        System.out.println(str);
    }

}