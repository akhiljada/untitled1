import java.util.Scanner;

public class assignment8
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int[] array=new int[1];
            int n = Integer.parseInt(scn.nextLine());
            if (10%n == 0)
                System.out.println(n + " is a factor of 99");
            else {
                array[2]=n;
            }

        }
        catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception encountered " + ex);
        }
    }
}