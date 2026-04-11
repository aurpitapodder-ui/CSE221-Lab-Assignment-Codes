import java.io.*;
import java.util.*;
public class Solution05 {
    static final int MOD = (int) 1e9 + 7;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int len = Integer.parseInt(br.readLine());
        
        String s = br.readLine();
        String [] s1 = s.split(" ");
        int [] arr = new int[len];

        for(int i = 0; i < len ; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }

        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                
            
            boolean check = false;
            if((arr[j]%2 ==0 && arr[j+1]%2==0) || (arr[j]%2!=0 && arr[j+1]%2!=0)){
                check = true;

            }
            if(check == true){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }

            
        }
            }

        for (int i = 0; i < arr.length; i++) {
            
            pw.print(arr[i]+ " ");
        }
        pw.println();
        pw.close(); 


    }
        
  
        
}

