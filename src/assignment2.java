import java.util.Scanner;
public class assignment2 {
    public static boolean findMiss(String str){

        return str.toLowerCase().replaceAll("[^a-z]","").length()==26;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the input string:\t");
        str = sc.nextLine(); //taking input from the user
        boolean result = findMiss(str);
        System.out.println("It's "+ result +" that given string contains all alphabets.");
    }
}
