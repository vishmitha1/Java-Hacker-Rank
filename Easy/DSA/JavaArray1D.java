package DSA;

import java.util.*;

public class JavaArray1D {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a=new int[n];
        int p=0;
        while(scan.hasNext()){
            a[p]=scan.nextInt();
            p++;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}