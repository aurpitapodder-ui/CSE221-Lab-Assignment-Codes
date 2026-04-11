import java.io.*;
import java.util.*;

public class Task05 {
    public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int [] arr = new int [n];
    st = new StringTokenizer(br.readLine());

    for (int index = 0; index < arr.length; index++) {
        arr[index] = Integer.parseInt(st.nextToken());     
    }
   int left =0 ;
   int maxLen = Integer.MIN_VALUE;
   int sum=0;
   for (int right = 0; right < arr.length; right++) {
       sum += arr[right];
       while(sum > K && left<=right){
        sum-= arr[left];
        left++;
       }
       maxLen = Math.max(maxLen, right - left +1);
       
    
   }
   pw.println(maxLen);

    pw.flush();
    }
}