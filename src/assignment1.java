import java.io.File;
import java.util.Scanner;
public class assignment1{

    private void findFile()
    {

        // files or folder where to search
        File file = new File("/home/zadmin");
        //string to store the name of the file
        String str ;
        //  Scanner is declare
        Scanner s = new Scanner(System.in);
        // do while is used to run the program again and again
        while(true){
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            //take input
            str =s.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            //continous check each file or folder
            for (String string : files){
                Boolean str1 = str.equals(string);
                // str1 is true than print the following
                if (str1){
                    ab = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            //if file not found
            if(ab == 0)
            {
                System.out.println("File not find : Re-enter the name of the file.");
            }
        }
    }
    public static void main(String[] args){
        //object of Demo class is created
        assignment1 obj =new assignment1();
        obj.findFile();
    }
}
