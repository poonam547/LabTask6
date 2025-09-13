 import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine()); 
        
        while (testCases-- > 0) {
            String pattern = sc.nextLine();
            try {
                Pattern.compile(pattern); 
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}


