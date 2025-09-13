 import java.util.*;
import java.math.BigInteger;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        
        BigInteger sum = a.add(b);
        
        BigInteger product = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(product);
        
        sc.close();
    }
}


