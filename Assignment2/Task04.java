import java.io.*;
import java.util.*;
public class Task04{
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
     
    int m =  Integer.parseInt(br.readLine());
    int [] arr1 = new int[n];
     for (int index = 0; index < n; index++) {
        arr1[index] = Integer.parseInt(st.nextToken());
        
    }  
    int [] arr2 = new int[m];
    st = new StringTokenizer(br.readLine());
    
  
    for (int i = 0; i < m; i++) {
        arr2[i] = Integer.parseInt(st.nextToken());
    }

    int newArr[] = new int[n+m];

    int i=0;
    int j =0;
    int idx =0;

    while(i<n && j<m){

        if(arr1[i]<= arr2[j]){
            newArr[idx++] = arr1[i];
            i++;
        }
        else{
            newArr[idx++] = arr2[j];
            j++;
        }

    }
    
    if(i<n){
        for (int index = i; index < n; index++) {
            newArr[idx++] = arr1[index];
            
        }

    }
    if(j<m){
        for (int index = j; index < m; index++) {
            newArr[idx++] = arr2[index];
        }
    }
    
    for(int k =0; k<newArr.length ;k++){
      pw.print(newArr[k]+" ");
    }
        pw.println();
        pw.close();
    }
}

