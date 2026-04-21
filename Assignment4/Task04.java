import java.io.*;
import java.util.*;
public class Task04 {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int [] u = new int [M];
    int [] v = new int [M];
    int [] degree = new int[N+1];
    st = new StringTokenizer(br.readLine());
    for (int index = 0; index < M; index++) {     
        u[index] = Integer.parseInt(st.nextToken());
        
    }
    st = new StringTokenizer(br.readLine());
    for (int index = 0; index < M; index++) {    
        v[index] = Integer.parseInt(st.nextToken());
        
    }
    
    for (int i = 0; i < M; i++) {
        degree[u[i]]++;
        degree[v[i]]++;
    }

    int count =0;

    for (int i = 1; i < degree.length; i++) {
        if(degree[i]%2!=0){
            count++;
        }
    }
    if(count==0 || count ==2){
        pw.print("YES");
    }
    else{
        pw.print("NO");
    } 
  
    pw.flush();

}
}
