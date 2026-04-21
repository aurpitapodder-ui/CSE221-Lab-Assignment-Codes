import java.io.*;
import java.util.*;
public class Task08 {
    static int R;
    static int H;
    static char[][] grid;
    static boolean [][] visited;
    static int dfs(int i, int j){
        if(i<0 || j<0 || i>=R || j>=H) return 0;
        if(visited[i][j]||grid[i][j] == '#') return 0;
        visited[i][j] = true;
        int diamond = 0;
        if(grid[i][j] == 'D') diamond = 1;

        diamond+= dfs(i-1,j);
        diamond+= dfs(i,j-1);
        diamond+= dfs(i+1,j);
        diamond+= dfs(i,j+1);

        return diamond;
    }
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
     R = Integer.parseInt(st.nextToken());
     H = Integer.parseInt(st.nextToken());
     grid = new char[R][H];
     visited = new boolean[R][H];

     for (int i = 0; i < R; i++) {
        grid[i] = br.readLine().toCharArray();
        
     }
     int diamonds = 0;
     for (int i = 0; i < R; i++) {
        for (int j= 0; j < H; j++) {
            if(!visited[i][j] && grid[i][j]!= '#'){
                int count = dfs(i,j);
                diamonds = Math.max(diamonds, count);
            }
            
        }
        
     }

    pw.println(diamonds);
    pw.flush();


    
    }    
}
