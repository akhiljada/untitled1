import java.util.Scanner;
public class userinput {
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("enter");
        String name=keyboard.nextLine();
        System.out.println("enter age ");
        int age=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("enter city");
        String city=keyboard.nextLine();
        System.out.println("I am " + name +" and aged " + age + ", lives in "+ city+ ".");



    }
}
