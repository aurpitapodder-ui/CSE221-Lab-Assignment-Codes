import java.io.*;
import java.util.*;

public class Assignment2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int [] arr = new int [N];

        for (int index = 0; index < arr.length; index++) {
            arr[index] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N-1;
        ArrayList<String> indices = new ArrayList<>();
        while(left<right){
            long sum = arr[left] + arr[right];
            if(sum == S){
                indices.add((left+1)+" "+(right+1));
                break;
            }
            else if(sum<S){
                left++;

            }
            else{
                right--;
            }
        }

        if(indices.isEmpty()){
            pw.println("-1");
        }
        for (String i : indices) {
            pw.println(i);
            
        }
        pw.flush();
    }
    
}