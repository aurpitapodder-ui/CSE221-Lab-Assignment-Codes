import java.io.*;
import java.util.*;
public class Task03 {
    static long mod = 107;
    static long ans = 1;
    static void power(long a, long b){
    while(b > 0){
        if(b%2 != 0){
           ans= (ans * a) % mod ;
        }
        a = (a * a ) % mod;
        b = b/2;
    }

    }
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    power(a, b);
    pw.println(ans);
    pw.flush();
    }
}
