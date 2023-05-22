import java.io.*;
import java.util.*;

public class Solution {    
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();      
        while (i > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;            
            for(int x = 0 ; x < n ; x++){
                result = result + (int)Math.pow(2,x) * b;
                System.out.printf(result + " ");
            }           
            System.out.println();
            i--;
        }        
        scanner.close();
    }
}
