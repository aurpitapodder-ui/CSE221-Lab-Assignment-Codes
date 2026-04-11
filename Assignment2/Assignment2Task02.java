import java.io.*;
import java.util.*;

public class Assignment2Task02 {
    public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n1 = Integer.parseInt(st.nextToken());
    int n2 = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int arr1[] = new int [n1];
    int arr2[] = new int [n2];

    for (int index = 0; index < arr1.length; index++) {
        arr1[index] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());

    for (int index = 0; index < arr2.length; index++) {
        arr2[index] = Integer.parseInt(st.nextToken());
    }
    
    int i =0;
    int j = n2-1;
    int difference = Integer.MAX_VALUE; 
    int I = -1;
    int J = -1;
    while(i<n1 && j>=0){
        int sum = arr1[i] + arr2[j];
        int diff = Math.abs(sum - K);
        if(diff < difference){
            difference = diff;
            I = i;
            J = j;

        }
        else if(sum<K){
            i++;
        }
        else{
            j--;
        }
         
    }
     
    pw.println((I+1)+" "+(J+1));
    pw.flush();
    
    }
    
}
