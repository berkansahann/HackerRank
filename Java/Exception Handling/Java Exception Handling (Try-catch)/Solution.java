import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        try{
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a / b);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e){
            System.out.println(e.toString());            
        }
        scanner.close();
    }
}
