import java.io.*;
import java.util.*;
public class Task03 {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());
    int [] u = new int[M];
    int [] v = new int [M];
    ArrayList<Integer>[] adj = new ArrayList[N+1];
    for (int i = 1; i < adj.length; i++) {
        adj[i] = new ArrayList<>();
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < u.length; i++) {
        u[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < v.length; i++) {
        v[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < M ; i++) {
        adj[u[i]].add(v[i]);
        adj[v[i]].add(u[i]);
        
    }
    for (int i = 1; i <= N; i++) {
    Collections.sort(adj[i]);
    }
    int[] visited = new int[N+1];
    int [] distance = new int [N+1];
    int [] parent = new int [N+1];
    Queue<Integer> q = new LinkedList<>();
    q.add(S);
    visited[S] = 1;
    distance[S] = 0;
    parent[S] = -1;
    while(!q.isEmpty()){
        int x = q.poll();
        for (int y : adj[x]) {
            if(visited[y]==0){
                visited[y] = 1;
                distance[y] = distance[x] +1;
                parent[y] = x;
                q.add(y);
            }
            
        }

    }
    if(visited[D]!=0){
      pw.println(distance[D]);
      ArrayList<Integer> path = new ArrayList<>();
        for (int i = D; i!= -1; i = parent[i]) {
            path.add(i);
            
        }
        Collections.reverse(path);
        for (int i : path) {
            pw.print(i+" ");
            
        }
        pw.println();
    }

    else if(visited[D]==0){
        pw.println("-1");
    }
    
    pw.flush();
    
}
 
}
