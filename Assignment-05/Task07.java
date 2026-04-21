import java.io.*;
import java.util.*;
public class Task07 {
    static ArrayList<Integer>[]adj;
    static boolean found = false;
    static int []visited;
    static void dfs(int node){
        visited[node] = 1;
        for (int v: adj[node]) {
            if(visited[v] == 0){
                dfs(v);
                if(found == true) return;
            }
            else if(visited[v]==1){
                found = true;
                return;
            }
            
            
        }
        visited[node] = 2;
    }
   public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    adj  = new ArrayList[N+1];
    for (int index = 0; index < adj.length; index++) {
        adj[index] = new ArrayList<>();
        
    }

    for (int index = 0; index < M; index++) {
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        adj[u].add(v);
        
    }
    visited = new int[N+1];
    for (int i = 1; i <= N; i++) {
        if(visited[i]==0){
            dfs(i);
            if(found == true) break;
        }

        
    }


    if(found == true){
        pw.println("YES");
    }
    else{
        pw.println("NO");
    }

    pw.flush();
    
    }      
}
