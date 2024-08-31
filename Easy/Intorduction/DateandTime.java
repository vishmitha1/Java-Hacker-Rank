package Intorduction;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c=Calendar.getInstance();
        // c.add(Calendar.YEAR, -year);
        c.add(Calendar.MONTH, -month);
        // c.add(Calendar.DAY_OF_MONTH, -day);
        System.out.println( c.get(Calendar.DAY_OF_WEEK));
        return "d";
    }

}

public class DateandTime {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int month = Integer.parseInt(firstMultipleInput[0]);

        // int day = Integer.parseInt(firstMultipleInput[1]);

        // int year = Integer.parseInt(firstMultipleInput[2]);

        Result.findDay(8, 7, 2015);

        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

