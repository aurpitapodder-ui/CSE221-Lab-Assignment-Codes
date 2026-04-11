import java.io.*;
import java.util.*;

public class Untitled {
    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        for (int index = 0; index < t; index++) {
            String l = br.readLine();
            Double result = 0.0;
            String [] divide = l.split(" ");
            int n = Integer.parseInt(divide[1]);
            int m = Integer.parseInt(divide[3]);
            String exp = divide[2];
            if(exp.equals("+")){
               result = (double)n+m;
            }
            else if(exp.equals("-")){
               result = (double) n-m;
            }
            else if(exp.equals("/")){
               result = (double) n/m;
            }
            else if(exp.equals("*")){
               result = (double) n*m ;
            }
 
             pw.printf("%.6f\n", result);
            
            
        }
        

        pw.close();
    }
}
