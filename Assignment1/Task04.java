import java.io.*;
import java.util.*;
public class Solution04{
    static final int MOD = (int) 1e9 + 7 ;
    public static boolean nondescending (int[]arr, int length){
        for (int i = 1; i < arr.length; i++) {
          if(arr[i] < arr[i-1]){
            return false;
          }
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            int len = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int arr[] = new int[len];
            String s1[] = s.split(" ");
            boolean isTrue = true;
            for (int j = 0; j < len; j++) {
                arr[j] = Integer.parseInt(s1[j]);
            }
            boolean check = nondescending(arr, len);
            if(check == true){
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }
        }
        pw.close();
    }
}
