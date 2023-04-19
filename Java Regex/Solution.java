import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        scanner.close();
    }

}

class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." + num + "." + num + "." +num;
}