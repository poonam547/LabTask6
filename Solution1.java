       import java.util.*;

public class Solution1 {

    public static String getDay(String day, String month, String year) {
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        Calendar cal = Calendar.getInstance();
        cal.set(y, m - 1, d); 

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String result = "";
        switch (dayOfWeek) {
            case Calendar.SUNDAY: result = "SUNDAY"; break;
            case Calendar.MONDAY: result = "MONDAY"; break;
            case Calendar.TUESDAY: result = "TUESDAY"; break;
            case Calendar.WEDNESDAY: result = "WEDNESDAY"; break;
            case Calendar.THURSDAY: result = "THURSDAY"; break;
            case Calendar.FRIDAY: result = "FRIDAY"; break;
            case Calendar.SATURDAY: result = "SATURDAY"; break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(getDay(day, month, year));
    }
}

