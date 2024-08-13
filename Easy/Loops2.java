import java.util.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double tot=a;
            for(int k=0;k<n;k++){
                tot=tot+(Math.pow(2, k))*b;
                int finalTot=(int)tot;
                System.out.print(finalTot+" ");
            }
            System.out.println();
        }
        in.close();
    }
}