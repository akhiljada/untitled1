import java.util.Scanner;
import java.util.regex.Pattern;

public class assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "[A-Z]+[a-z]";

        System.out.print("Enter the sentence: ");
        String input = sc.nextLine();
        boolean Matches=(Pattern.matches(regex, input));
        System.out.println("Is sentence start with Camel Case and ending with period? " + Matches);
    }
}