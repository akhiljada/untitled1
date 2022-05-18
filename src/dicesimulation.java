import java.util.Random;
public class dicesimulation {
    public static void main(String[] args){
        Random random =new Random();
        int dice;
        for(int i=0;i<10;i++){
            dice= random.nextInt(7);
            System.out.println(dice);
        }
    }
}
