import java.io.*;
import java.util.*;
public class Task02 {
    static class Pair{
        int v;
        int w ;
        Pair(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // vertices
        int m = Integer.parseInt(st.nextToken()); // number of edges
        int [] u = new int [m];
        int [] v = new int [m]; 
        int [] w = new int [m];
        st = new StringTokenizer(br.readLine());
        for (int index = 0; index < m; index++) {
            u[index] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int index = 0; index < m; index++) {
            v[index] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int index = 0; index < m; index++) {
            w[index] = Integer.parseInt(st.nextToken());
        }

        ArrayList <Pair>[] adj = new ArrayList[n+1];
        for (int index = 1; index <= n; index++) {
            adj[index] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            adj[u[i]].add(new Pair(v[i], w[i]));
        }
          for (int i = 1; i <= n; i++) {
            System.out.print(i + ":");

            for (Pair x : adj[i]) {
                System.out.print(" (" + x.v + "," + x.w + ")");
            }

            System.out.println();
        }

        pw.flush();
    }
}
