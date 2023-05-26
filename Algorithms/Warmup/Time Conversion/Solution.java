import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        if(s.contains("PM")){
            s = s.substring(0, s.length() - 2);
            if(hour.equals("12")){
                return s;
            }
            int newHour = Integer.parseInt(hour) + 12;
            s = s.replaceFirst(hour, Integer.toString(newHour));
        }else {
            s = s.substring(0, s.length() - 2);
            if(hour.equals("12")){
                s = s.replaceFirst(hour, "00");
                return s;
            }
        }
        return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
