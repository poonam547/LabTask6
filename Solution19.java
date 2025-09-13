import java.io.*;
import java.util.*;

public class Solution19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int negativeCount = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end]; 
                if (sum < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println(negativeCount);
        
        scanner.close();
    }
}

