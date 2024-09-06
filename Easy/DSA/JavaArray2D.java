package DSA;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;



public class JavaArray2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int[][] myarr=new int[6][6];
        for(int r=0;r<6;r++){
            for(int c=0;c<6;c++){
                myarr[r][c]=arr.get(r).get(c).intValue();
            }
        }
        int maxtot= Integer.MIN_VALUE;

        for(int r=0;r<6-2;r++){
            for(int c=0;c<6-2;c++){
                int temptot=myarr[r][c]+
                        myarr[r][c+1]+myarr[r][c+2]+
                        myarr[r+1][c+1]+
                        myarr[r+2][c]+myarr[r+2][c+1]+myarr[r+2][c+2];
                if(temptot>=maxtot){
                    maxtot=temptot;
                }

            }
        }
        System.out.println(maxtot);

        bufferedReader.close();
    }
}

