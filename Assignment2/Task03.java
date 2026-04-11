import java.io.*;
import java.util.*;
public class Task03 {
    static class Pair{
        int value;
        int index;
        Pair(int val, int i){
            this.value = val;
            this.index = i;
        }
    }
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());
    Pair [] arr = new Pair[n];
    st = new StringTokenizer(br.readLine());

    for (int index = 0; index < arr.length; index++) {
        int val = Integer.parseInt(st.nextToken());
        arr[index] = new Pair(val, index+1);
        
    }
    Arrays.sort( arr, (a,b) -> a.value - b.value) ;
    for (int i = 0; i < n-2 ; i++) {
        int j = i+1;
        int k = n-1;
        while(j<k){
            long sum = arr[i].value + arr[j].value + arr[k].value;
            if(sum == x){
                pw.println(arr[i].index + " " + arr[j].index + " "+ arr[k].index);
                pw.flush();
                return;
            }
            else if(sum > x){
                k--;
            }
            else{
                j++;
            }
        }
        
    }
    
     pw.println("-1");


    pw.flush();
    
}
    
}
