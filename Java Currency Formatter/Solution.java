// Java program to implement
// the above function

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double u = sc.nextDouble();
        sc.close();
        Locale indiaLocale = new Locale("en", "IN");
        System.out.println("US: "+NumberFormat.getCurrencyInstance(Locale.US).format(u));
        System.out.println("India: "+NumberFormat.getCurrencyInstance(indiaLocale).format(u));
        System.out.println("China: "+NumberFormat.getCurrencyInstance(Locale.CHINA).format(u));
        System.out.println("France: "+NumberFormat.getCurrencyInstance(Locale.FRANCE).format(u));
    }
}
