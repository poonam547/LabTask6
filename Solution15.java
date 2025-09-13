import java.math.BigInteger;
import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        BigInteger number = new BigInteger(input);

        if (number.isProbablePrime(10)) { 
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}


