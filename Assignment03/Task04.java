import java.io.*;
import java.util.*;

public class Task04 {
    static long mod = 1000000007;
    static long [][]result;
    static long[][] multiplication(long [][] B, long [][]C){
    long [][] A = new long [2][2];
    A[0][0] = ((B[0][0] * C[0][0]) + (B[0][1] * C[1][0]))% mod;
    A[0][1] = ((B[0][0] * C[0][1])+ (B[0][1] * C[1][1]))% mod;
    A[1][0] = ((B[1][0] * C[0][0])+ (B[1][1] * C[1][0]))% mod;
    A[1][1] = ((B[1][0] * C[0][1]) + (B[1][1] * C[1][1]))% mod;

    return A;
    }
    static void power(long[][] arr , long x){
        while (x>0) {
            if (x%2 !=0) {
                result = multiplication(result , arr);
            }
            arr = multiplication(arr, arr);
            x = x/2;
        }
    }
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
    result = new long[][]{{1,0},{0,1}};
    StringTokenizer st = new StringTokenizer(br.readLine());
    long [][] arr = new long [2][2];

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = Long.parseLong(st.nextToken());
            
        }
    }
    long x = Long.parseLong(br.readLine());
    power(arr,x);
    pw.println(result[0][0] + " "+ result[0][1]);
    pw.println(result[1][0] + " "+ result[1][1]);

    }
    pw.flush();

    }
    
}
