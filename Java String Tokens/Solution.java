import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println("0");
        } else {
            String[] arrOfStr = s.split("[ !,?._'@]+");
            System.out.println(arrOfStr.length);
            for (String a : arrOfStr) {
                System.out.println(a);
            }
        }
    }
}
1