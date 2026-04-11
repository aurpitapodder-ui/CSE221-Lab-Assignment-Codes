import java.io.*;
import java.util.*;

public class Task06 {
    static int [] arr;
    static void build(int left, int right){
        if(left > right) return;
        int mid = left + (right - left)/2 ;
        System.out.print(arr[mid]+ " ");
        build(left, mid-1);
        build(mid+1, right);
        
    }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int n = Integer.parseInt(br.readLine());
    arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());  
    for (int index = 0; index < arr.length; index++) {
        arr[index] = Integer.parseInt(st.nextToken());
    }

    build(0, n-1);
  }
}
