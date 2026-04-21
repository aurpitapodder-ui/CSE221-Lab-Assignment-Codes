import java.io.*;
import java.util.*;
public class Task01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] adj = new ArrayList[N+1];


        for (int index = 0; index < adj.length; index++) {
            adj[index] = new ArrayList<>();
        }
        

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
            
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }
        
        int [] visited = new int[N+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = 1;
        while(!q.isEmpty()){
            int u = q.poll();
            pw.print(u+" ");
            for (int v : adj[u]) {
                if(visited[v]==0){
                    visited[v] = 1;
                    q.add(v);
                }
                
            }
        }


    pw.println();
    pw.flush();  

    
    }
    
}
