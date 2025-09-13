 import java.io.*;
import java.util.*;
import java.text.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}


