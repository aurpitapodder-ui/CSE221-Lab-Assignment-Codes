import java.io.*;
import java.util.*;

public class Task05{
    static long mod;
    
    static long[] series(long a, long n){
     if(n == 0) return new long[]{1, 0};

        long[] half = series(a, n/2);
        long p = half[0];      
        long s = half[1];      

        long newP = (p * p) % mod;
        long newS = (s * (1 + p) % mod) % mod;

        if(n % 2 == 1){
            newS = (newS * a + a) % mod;
            newP = (newP * a) % mod;
        }

        return new long[]{newP, newS};
    }
  
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    mod =  Long.parseLong(st.nextToken());
    pw.println(series(a, b)[1]);

    }
    pw.flush();
}
}
