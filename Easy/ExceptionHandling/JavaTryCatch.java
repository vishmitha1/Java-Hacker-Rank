package ExceptionHandling;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class JavaTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner scan = new Scanner(System.in);
            int input1 = scan.nextInt();
            int input2 =scan.nextInt();
            System.out.println(input1/input2);
            scan.close();
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
