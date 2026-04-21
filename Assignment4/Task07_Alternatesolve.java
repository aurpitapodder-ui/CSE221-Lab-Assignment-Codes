import java.io.*;
import java.util.*;
public class Task07_Alternatesolve{
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
    int [] dx = {2,-2,2,-2,1,-1,-1,1}; // (±2, ±1) (±1, ±2)
    int [] dy = {1,-1,-1,1,2,-2,2,-2};

    for (int i = 0; i < Kpos.length; i++) {
        for (int j = 0; j < Kpos[0].length; j++) { 
            if(Kpos[i][j]!=0){ 
               for (int l = 0; l < 8; l++) {
                   int pos1 = i + dx[l];
                   int pos2 = j + dy[l];
                   if(pos1>=1 && pos1<=N && pos2>=1 && pos2<=M){
                   if(Kpos[pos1][pos2]==1){
                      pw.println("YES");
                      pw.flush();
                      return;
                    }
            
                   }
                }  
        }
    }
        
    }

    pw.println("NO");
    pw.flush();

}
}
