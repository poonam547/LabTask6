import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class UsernameValidator {
    // Regular expression for valid usernames
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}

public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // number of usernames

        Pattern pattern = Pattern.compile(UsernameValidator.regularExpression);

        for (int i = 0; i < n; i++) {
            String username = sc.nextLine();
            Matcher matcher = pattern.matcher(username);

            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}



