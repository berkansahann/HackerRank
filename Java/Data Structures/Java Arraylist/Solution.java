import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> querieList = new ArrayList<>();
        int n = scanner.nextInt();
        for(int c = 0; c < n; c++){
            int rowN = scanner.nextInt();
            List<Integer> row = new ArrayList<>();
            for(int rowC = 0; rowC < rowN; rowC++){
                row.add(scanner.nextInt());
            }
            querieList.add(row);
        }
        int a = scanner.nextInt();
        for(int b = 0; b < a; b++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try{
                System.out.println(querieList.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}