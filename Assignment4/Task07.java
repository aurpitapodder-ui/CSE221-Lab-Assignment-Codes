import java.io.*;
import java.util.*;
public class Task07 {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int [][] Kpos = new int [N+1][M+1];

    
    for (int i = 0; i < K; i++) {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Kpos [n][m] = 1;
    }
   
    for (int i = 0; i < Kpos.length; i++) {
        for (int j = 0; j < Kpos[0].length; j++) {
            if(Kpos[i][j]!=0){
               int x = i;
               int y = j;
            if (x - 2 >= 1 && y - 1 >= 1 && Kpos[x - 2][y - 1] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;
            }

            if (x - 2 >= 1 && y + 1 <= M && Kpos[x - 2][y + 1] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;
            }

            if (x - 1 >= 1 && y - 2 >= 1 && Kpos[x - 1][y - 2] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;      
            }

            if (x - 1 >= 1 && y + 2 <= M && Kpos[x - 1][y + 2] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;       
            }

            if (x + 1 <= N && y - 2 >= 1 && Kpos[x + 1][y - 2] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;       
            }

            if (x + 1 <= N && y + 2 <= M && Kpos[x + 1][y + 2] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;         
            }

            if (x + 2 <= N && y - 1 >= 1 && Kpos[x + 2][y - 1] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;        
            }

            if (x + 2 <= N && y + 1 <= M && Kpos[x + 2][y + 1] == 1) {
                pw.println("YES"); 
                pw.flush(); 
                return;        
            }
        }
    }
}
pw.println("NO");
pw.flush();
}
}
