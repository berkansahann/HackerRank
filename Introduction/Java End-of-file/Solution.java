import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 1;
        while (scanner.hasNext()){
            String line = (scanner.nextLine());
            System.out.println(c + " " + line);
            c++;
        }
            scanner.close();
    }

}
