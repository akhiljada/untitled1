package yourname.assingment.main;
import yourname.assignment.data.da;
import yourname.assignment.singleton.sb;

public class mainclass {

    public static void main(String[] args) {
        da obj =new da();
        //global variables which can get default values.
        obj.display();
        //local variables which are not initialized but does not get any default values.
        obj.show();
        //static methods can only access static variables.
        String str="abcd";
        sb obj1 = new sb(str);
        obj1.b(str);
        obj1.print();

    }

}