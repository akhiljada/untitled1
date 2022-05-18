import java.io.*;
import java.util.*;

public class assignment11 {
    public static void main(String[] args) {
        Scanner infile;
        try {
            infile = new Scanner(new File("/home"));
            String string;
            HashMap<Character,Integer> charCountMap = new HashMap<>();
            while(infile.hasNext()) {
                string = infile.next();
                // System.out.println(string);
                char[] strArray = string.toCharArray();

                // checking each char of strArray
                for (char c : strArray) {
                    if (charCountMap.containsKey(c)) {

                        // If char is present in charCountMap,
                        // incrementing it's count by 1
                        charCountMap.put(c, charCountMap.get(c) + 1);
                    }
                    else {
                        // If char is not present in charCountMap,
                        // putting this char to charCountMap with 1 as it's value
                        charCountMap.put(c, 1);
                    }
                }
            }
            infile.close();

            PrintWriter pw = new PrintWriter("/home/assignment11textFile.txt");
            // Printing the charCountMap
            charCountMap.forEach((key, value) -> pw.println(key + " " + value));
            pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}