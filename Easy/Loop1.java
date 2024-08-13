import java.io.*;




public class Loop1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        int i=1;
        while (i<=10) {
            System.out.printf("%d x %d = %d\n",N,i,N*i);
            i++;
        }
        
        bufferedReader.close();
    }
}
