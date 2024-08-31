package Intorduction;

import java.util.Scanner;

public class Printf {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String num=String.format("%03d",x);
                int len=s1.length();
                
                System.out.printf("%s %"+(17-len)+"s\n",s1,num);
                //Complete this line
            }
            System.out.println("================================");
                sc.close();

    }
}



