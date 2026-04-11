import java.io.*;
import java.util.*;

public class Solution {
    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        for (int index = 0; index < t; index++) {
            int n = Integer.parseInt(br.readLine());
            if(n%2==0){
                pw.println(n+" is an Even number.");
            }
            else{
                 pw.println(n+" is an Odd number.");
            }
            
        }
        

        pw.close();
    }
}


