import java.util.Scanner;
public class controls {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter standard ");
        int standard= keyboard.nextInt();
        System.out.println("enter grade ");
        char grade=keyboard.next().charAt(0);
        if(standard>0 && standard<6){
            System.out.println("you are in primary standard");
        }
        else{
            System.out.println("you are in secondary standard");
        }
        switch (grade) {
            case 'a' -> System.out.println("excellent");
            case 'b' -> System.out.println("good");
            case 'c' -> System.out.println("need to improve");
            case 'd' -> System.out.println("not good");
            default -> System.out.println("enter valid grade");
        }
    }
}
