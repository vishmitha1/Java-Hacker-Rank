import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner input = new Scanner(System.in);
         int i=1;
         while(input.hasNext()==true){
             String str=input.nextLine();
             System.out.printf("%d %s\n",i,str);
             i++;
         }
         input.close();
    }
}
