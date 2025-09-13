import java.util.Scanner;
import java.util.regex.*;

public class Solution13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        while (n-- > 0) {
            String line = in.nextLine();

            String regex = "<([^>]+)>([^<]+)</\\1>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);

            boolean found = false;
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        in.close();
    }
}