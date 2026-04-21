import java.io.*;
import java.util.*;
public class Task02 {
    static int [] visited;
    static ArrayList<Integer>[] adj;
    static void DFS(int s){
        visited[s] = 1;
        System.out.print(s+" ");
        for (int n : adj[s]) {
            if(visited[n] ==0){
                DFS(n);
            }
        }
    }
 public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int [] u = new int [M];
    int [] v = new int [M];
     adj = new ArrayList[N+1];
    for (int i = 1; i <= N; i++) {
        adj[i] = new ArrayList<>();
        
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
        u[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
        v[i] = Integer.parseInt(st.nextToken());
    }
    for (int i = 0; i < M; i++) {
        adj[u[i]].add(v[i]);  
        adj[v[i]].add(u[i]);
        
    }
    for (int i = 1; i <= N; i++) {
        Collections.sort(adj[i]);    
    }
    visited = new int[N+1];
    DFS(1);

    pw.flush();
 }   
}
