import java.util.Scanner;

class MyRegex {
    String pattern = "^((\\d{1,3})\\.){3}(\\d{1,3})$";
}

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        while (sc.hasNext()) {
            String IP = sc.next();
            if (IP.matches(myRegex.pattern)) {
                String[] parts = IP.split("\\.");
                boolean valid = true;
                for (String part : parts) {
                    int val = Integer.parseInt(part);
                    if (val < 0 || val > 255) {
                        valid = false;
                        break;
                    }
                }
                System.out.println(valid);
            } else {
                System.out.println(false);
            }
        }

        sc.close();
    }
}