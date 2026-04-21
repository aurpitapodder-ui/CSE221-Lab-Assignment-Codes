import java.io.*;
import java.util.*;
public class Task03 {
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int N = Integer.parseInt(br.readLine());
    int [] [] arr = new int [N][N];
  
    for (int i = 0; i < N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int j = 0; j < n; j++) {
            int idx = Integer.parseInt(st.nextToken());
            arr[i][idx] = 1;
        }
    }

    for (int i = 0; i< arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            pw.print(arr[i][j]+" ");
        }
        pw.println();
    }
        
    pw.flush();
    }
}
