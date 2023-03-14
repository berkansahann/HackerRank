import org.w3c.dom.ls.LSInput;

import javax.xml.stream.events.StartDocument;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        Double second = scanner.nextDouble();
        scanner.nextLine();
        String third = scanner.nextLine();

        System.out.println("String: " +third);
        System.out.println("Double: " +second);
        System.out.println("Int: " +first);
    }
}
