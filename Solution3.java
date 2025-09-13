import java.io.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        int sumLengths = a.length() + b.length();
        System.out.println(sumLengths);
        
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String aCap = a.substring(0, 1).toUpperCase() + a.substring(1);
        String bCap = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(aCap + " " + bCap);
        
        scanner.close();
    }
}




