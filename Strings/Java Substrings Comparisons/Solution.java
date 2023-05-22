import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String smallest = "";
        String largest = "";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();
        for (int c = 0; c < s.length()-(k-1); c++){
            String sub = s.substring(c, c+k);
            if (c == 0){
                smallest = sub;
                largest = sub;
            }
            if (sub.compareTo(smallest) < 0){
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0){
                largest = sub;
            }
        }
        System.out.println(smallest + "\n" + largest);
    }
}