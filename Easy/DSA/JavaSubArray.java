package DSA;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class JavaSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int arSize=scn.nextInt();
        int[] arr= new int[arSize];
        int totalNegativeSubs=0;
        for(int i=0;i<arSize;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<=arSize;i++){
            for(int k=i;k<=arSize;k++){
                int [] temp= Arrays.copyOfRange(arr,i, k);
                int tempCount=0;
                for (int j : temp) {
                    tempCount=tempCount+j;
                }
                if(tempCount<0){
                    //    System.out.printf("%d %d  ",i,k+i);
                    //    System.out.println(Arrays.toString(temp));

                    totalNegativeSubs++;
                }
            }
        }


        System.out.print(totalNegativeSubs);

    }
}


