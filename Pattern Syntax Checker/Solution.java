import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            String pattern = scanner.nextLine();
            try {
                Pattern pat = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            n--;
        }
    }
}