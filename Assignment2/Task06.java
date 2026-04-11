import java.io.*;
import java.util.*;

public class Task06{
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
    int max = Integer.MIN_VALUE;
    for (int index = 0; index < arr.length; index++) {

        if(arr[index]>max){
            max = arr[index];
        }
    }
   int [] freqarr = new int[max+1];
   int left =0 ;
   int maxLen = Integer.MIN_VALUE;
   int distinct=0;
   for (int right = 0; right < arr.length; right++) {
       if(freqarr[arr[right]] == 0) distinct++;
          freqarr[arr[right]]++;

        while(distinct > K && left<=right){
            freqarr[arr[left]]--;
            if(freqarr[arr[left]] == 0) distinct--;
            left++;
        }
       maxLen = Math.max(maxLen, right - left +1);
       
    
   }
   pw.println(maxLen);

    pw.flush();
    }
}