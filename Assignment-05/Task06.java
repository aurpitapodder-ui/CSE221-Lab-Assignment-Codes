import java.io.*;
import java.util.*;
public class Task06 {
    static int [] visited;
    static int[] subtree;
    static ArrayList<Integer>[] adj;

    static void DFS(int R){
        visited[R] =1;
        subtree[R] = 1;
       for (int v : adj[R]) {
        if(visited[v]==0){
            DFS(v);
             subtree[R] += subtree[v]; 
        }
        
       }
    }

    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int R = Integer.parseInt(st.nextToken());
    int M = N-1;
    adj = new ArrayList[N+1];
    for (int index = 1; index < adj.length; index++) {
        adj[index] = new ArrayList<>();
    }
    for (int i = 1; i <= M; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      adj[u].add(v);
      adj[v].add(u);

    }
    visited = new int [N+1];
    subtree = new int [N+1];
    DFS(R);
    int q = Integer.parseInt(br.readLine());
    while (q-- > 0) {
        int x = Integer.parseInt(br.readLine());
        pw.println(subtree[x]);
        
    }
    pw.flush();
    }    
}
