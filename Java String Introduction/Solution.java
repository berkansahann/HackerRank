import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int result = A.length()+ B.length();
        System.out.println(result);
        if (A.compareTo(B) >  0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String output = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring( 1);
        System.out.println(output);
    }
}
