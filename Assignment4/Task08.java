import java.io.*;
import java.util.*;
public class Task08 {
    static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    ArrayList <Integer>[] adj = new ArrayList[N+1];
    for (int index = 1; index <= N; index++) {
        adj[index] = new ArrayList<>();
    }
    for (int i = 1; i <=N; i++) {
        for (int j = i+1; j <=N; j++) {
            if(gcd(i,j) ==1){
              adj[i].add(j);
              adj[j].add(i);
            }
        }
    }
    while(q>0){
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if(K <= adj[X].size()){
          pw.println(adj[X].get(K-1));
        }
        else{
            pw.println("-1");
        }

        q--;
    }
    pw.flush();
}    
}
