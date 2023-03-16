import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 100 && n >= -100) {
            String s = Integer.toString(n);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}