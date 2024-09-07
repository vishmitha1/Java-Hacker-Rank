package Strings;

import java.io.*;
        import java.util.*;

public class JavaStringRevers {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        char[] arr1=A.toCharArray();
        char[] arr2=new char[A.length()];
        for(int i=0;i<A.length();i++){
            arr2[i] = arr1[A.length() - i - 1];
        }

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}




