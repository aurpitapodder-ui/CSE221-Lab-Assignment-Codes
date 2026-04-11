import java.io.*;
import java.util.*;
public class Assignment2Task07{
       static int lowerbound(int[] arr, int x){
        int left =0;
        int right = arr.length -1;
        int idx = arr.length;
        while(left<=right){
            int mid = (int) left + (right - left)/2;
            if(arr[mid] >= x){
                idx = mid;
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return idx;
       }

       static int upperbound(int[] arr, int y){
        int left =0;
        int right = arr.length -1;
        int idx = arr.length;
        while(left<=right){
            int mid = (int) left + (right - left)/2;
            if(arr[mid] > y){
                idx = mid;
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        return idx;
       }

    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    int arr[] = new int[n];
    st = new StringTokenizer(br.readLine());

    for (int index = 0; index < n; index++) {
        arr[index] = Integer.parseInt(st.nextToken());
    }

    while(q>0){
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int count = upperbound(arr,y) - lowerbound(arr, x) ;
        
        pw.println(count);

        q--;
    }

    pw.close();
    }
}
