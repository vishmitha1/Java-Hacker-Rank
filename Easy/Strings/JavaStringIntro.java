package Strings;


import java.io.*;
        import java.util.*;

public class JavaStringIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lenthOfAB=A.length()+B.length();
        System.out.println(lenthOfAB);
        if(A.compareTo(B)>B.compareTo(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));

        /* Enter your code here. Print output to STDOUT. */

    }
}




