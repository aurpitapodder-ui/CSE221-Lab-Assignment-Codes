import java.io.*;
import java.util.*;

public class Task08{
    public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    
    int T  = Integer.parseInt(br.readLine());
    
    while(T-->0){
       StringTokenizer st = new StringTokenizer(br.readLine());
 
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int blocks = (k-1) / (x-1);
        int offset = k - blocks *(x-1);
        int ans = blocks * x + offset; 
        pw.println(ans);
        
     
    }
    pw.flush();
    }
}