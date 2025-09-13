 import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();   
        sc.close();
        
        String rev = new StringBuilder(A).reverse().toString();
        
        if (A.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

