import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<>();
        names.add("ask");
        names.add("ask1");
        names.add("ask2");
        for(int i=0;i< names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
