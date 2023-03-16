import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("================================");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            String s = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d\n", s, x);
        }
        scanner.close();
        System.out.println("================================");
    }
}
