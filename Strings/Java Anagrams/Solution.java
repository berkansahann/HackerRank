import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().toLowerCase();
        String b = scanner.nextLine().toLowerCase();
        scanner.close();
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        if (Arrays.equals(arrayA, arrayB)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}