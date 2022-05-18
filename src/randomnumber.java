import java.util.Random;
public class randomnumber {
    public static void main(String[] args){
        Random random=new Random();
        int mynumber= random.nextInt();
        System.out.println(mynumber);
        int number=random.nextInt(1000);
        System.out.println(number);

    }
}
