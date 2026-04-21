import java.io.*;
import java.util.*;
public class Task05 {
    static ArrayList<Integer>[] adj;
    static int[] visited ;
    static int [] complement;
    static void dfs(int node, int id){
        visited[node] = 1;
        complement[node] = id;
        for (int n : adj[node]) {
           if(visited[n]== 0) {
              dfs(n,id);
           }
            
        }
    }

    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
     adj = new ArrayList[N+1];
    for (int index = 0; index < adj.length; index++) {
        adj[index] = new ArrayList<>();
    }
    
    for (int index = 0; index < M; index++) {
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        adj[u].add(v);
        adj[v].add(u);
        
    }
    visited = new int [N+1];
    complement = new int [N+1];
    int id =0;
    for (int i = 1; i <=N; i++) {
        if(visited[i]==0){
          id++;
          dfs(i,id);
        }
    }
    
    while(q-- > 0){
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if(complement[x] == complement[y]){
            pw.println("YES");
        }
        else{
            pw.println("NO");
        }

    }
   


    pw.flush();

}
    }
    
