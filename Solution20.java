import java.util.ArrayList;
import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); 
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            list.add(row);
        }

        int q = sc.nextInt(); 

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); 
            int y = sc.nextInt(); 

            if (x > 0 && x <= list.size()) {
                ArrayList<Integer> row = list.get(x - 1);
                if (y > 0 && y <= row.size()) {
                    System.out.println(row.get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}

