import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int c = 0; c < n; c++){
            list.add(scanner.nextInt());
        }
        int i = scanner.nextInt();
        for(int c = 0; c < i; c++){
            String s = scanner.next();
            if(s.equals("Insert")){
                int index = scanner.nextInt();
                int number = scanner.nextInt();
                list.add(index, number);
            }else if(s.equals("Delete")){
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        scanner.close();
        for(int element : list){
            System.out.print(element + " ");
        }
    }
}
