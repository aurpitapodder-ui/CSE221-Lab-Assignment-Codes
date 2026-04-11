import java.io.*;
import java.util.*;
public class Task02 {

    static long inversion = 0;
    static void mergeSort(int[] arr, int l, int r){
        int mid = l + ((r-l)/2);
        if(l>=r) return;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        countPairs(arr, l, mid, r);
        merge(arr,l,mid,r);
    }


    public static void countPairs(int[] arr, int left, int mid, int right) {

    long[] squares = new long[right - mid];

    for (int i = mid + 1; i <= right; i++) {
        squares[i - (mid + 1)] = (long) arr[i] * arr[i];
    }

    Arrays.sort(squares);

    int j = 0;

    for (int i = left; i <= mid; i++) {
        while (j < squares.length && (long) arr[i] > squares[j]) {
            j++;
        }
        inversion += j;
    }
    }
    static void merge(int[]arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int [] left = new int [n1];
        int [] right = new int [n2];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[l+i];
            
        }

        for (int index = 0; index < right.length; index++) {
            right[index] = arr[mid+1+index];
        }
        
        int i=0;
        int j=0;
        int k = l;
        while (i<n1 && j<n2) {
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                
            }
            
        }
        
            while(i<n1) {
                arr[k++] = left[i++];
                
            }
        
        
            while(j<n2){
                arr[k++] = right[j++];
                
            }
        

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[len];

        for (int index = 0; index < arr.length; index++) {
            arr[index] = Integer.parseInt(st.nextToken());
        }
        int left =0; 
        int right = len-1;
        mergeSort(arr, left , right);

        pw.println(inversion);

        pw.println();
        pw.flush();

    }
    
}
