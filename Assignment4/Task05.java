import java.io.*;
import java.util.*;
public class Task05 {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int [] u = new int [M];
    int [] v = new int [M];
    int [] outdegree = new int[N+1];
    int [] indegree = new int[N+1];
    int [] diff = new int[N+1];
    st = new StringTokenizer(br.readLine());
    for (int index = 0; index < M; index++) {     
        u[index] = Integer.parseInt(st.nextToken());
        
    }
    st = new StringTokenizer(br.readLine());
    for (int index = 0; index < M; index++) {    
        v[index] = Integer.parseInt(st.nextToken());
        
    }
   for (int i = 0; i<M; i++) {
       outdegree[u[i]]++;
       indegree[v[i]]++;  
   }
   for (int i = 1; i <diff.length ; i++) {
       diff[i] = indegree[i] - outdegree[i];
   }

  for (int i = 1; i < diff.length; i++) {
    pw.print(diff[i] + " ");
  }

   pw.flush();

}
}