import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while(n > 0){
            String username = scanner.nextLine();
            if(username.matches(UsernameRegex.pattern))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            n--;
        }
        scanner.close();
    }
}

class UsernameRegex{
    static String pattern = "^[a-zA-Z][\\w]{7,29}$";
}