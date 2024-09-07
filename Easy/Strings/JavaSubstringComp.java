package Strings;

import java.util.Scanner;

public class JavaSubstringComp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] arr=new String[s.length()-(k-1)];

        for(int i=0;i<s.length()-(k-1);i++){
            String tempstr;

            tempstr=s.substring(i, i+k);
            if(i==0){
                arr[i]=tempstr;
            }
            else{
                arr[i]=tempstr;
                if(i>0 && arr[i-1].compareTo(tempstr)>tempstr.compareTo(arr[i-1]))              {
                    arr[i]=arr[i-1];
                    arr[i-1]=tempstr;
                }



            }
        }
        smallest=arr[0];
        for (String str : arr) {
            if(str.compareTo(smallest)< smallest.compareTo(str)){
                smallest=str;
            }
        }

        largest=arr[arr.length-1];


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
