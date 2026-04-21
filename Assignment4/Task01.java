import java.io.*;
import java.util.*;
public class Task01 {
    public static void main(String[] args) throws Exception{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [][] adjMat = new int [n][n];
        
        for (int i = 1; i <= m; i++) {
          st = new StringTokenizer(br.readLine());
          int u = Integer.parseInt(st.nextToken());
          int v = Integer.parseInt(st.nextToken());
          int w = Integer.parseInt(st.nextToken());
          if(u>=1 || v>=1){
            adjMat[u-1][v-1] = w; 
          }
          
          
        }

        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                pw.print(adjMat[i][j]+" "); 
            }
            pw.println();
            
        }
        pw.flush();
    }
}
