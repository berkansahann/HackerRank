import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String straight = scanner.nextLine();
        scanner.close();
        StringBuilder reversed = new StringBuilder(straight);
        reversed.reverse();
        if(straight.equals(reversed.toString())){
            System.out.println("Yes");
        }
        else{
        System.out.println("No");
        }
    }
}