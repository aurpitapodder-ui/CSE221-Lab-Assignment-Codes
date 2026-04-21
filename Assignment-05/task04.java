import java.io.*;
import java.util.*;
public class task04 {
    static ArrayList<Integer>[]adj;
    static void BFS(int s, int[] parent, int[]distance){
        Queue<Integer>q = new LinkedList<>();
        q.add(s);
        int [] visited = new int[adj.length];
        visited[s] = 1;
        parent[s] = -1;
        distance[s] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v: adj[u]) {
                if(visited[v]==0){
                   visited[v] = 1;
                   parent[v] = u;
                   distance[v] = distance[u] + 1;
                   q.add(v);

                }
                
            }
            
        }
       
    }
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());  

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    int D = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    adj = new ArrayList[N+1];

    for (int index = 1; index <= N; index++) {
        adj[index] = new ArrayList<>();
    }

    for (int index = 1; index <= M; index++) {
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        adj[u].add(v);
        
    }
    int[] distS = new int[N + 1];
    int[] parentS = new int[N + 1];
    Arrays.fill(distS, -1);

    int[] distK = new int[N + 1];
    int[] parentK = new int[N + 1];
    Arrays.fill(distK, -1);

    BFS(S, parentS, distS);
    BFS(K, parentK, distK);
    if (distS[K] == -1 || distK[D] == -1) {
        pw.println(-1);
        pw.flush();
        return;
    }
    ArrayList<Integer> path1 = new ArrayList<>();
    for (int index = K; index!=-1; index= parentS[index]) {
        path1.add(index);
        
    }

    Collections.reverse(path1);
    ArrayList<Integer> path2 = new ArrayList<>();
    for (int index = D; index!=-1 ; index = parentK[index]) {
        path2.add(index);
        
    }

    Collections.reverse(path2);
    for (int i = 1; i < path2.size(); i++){
        path1.add(path2.get(i));
    }

    pw.println(path1.size() - 1);
    for (int x : path1){
        pw.print(x + " ");
    } 
    pw.println();
    pw.flush();


    }
}
