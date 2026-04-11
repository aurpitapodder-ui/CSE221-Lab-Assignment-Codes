import java.io.*;
import java.util.*;
public class SolutionTask05 {
    static final int MOD = (int) 1e9 + 7;
    public static boolean IsSorted(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            String [] parts = line.split(" ");
            arr[i] = Integer.parseInt(parts[i]);
            
        }
  
        ArrayList<String> moves = new ArrayList<>();
        for ( int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 2 -i; j++) {

                if (arr[j] > arr[j+2]) {
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                   moves.add((j + 1) + " " + (j + 3));
                }

                
            }
        }
          boolean check = IsSorted(arr);

          if(check == true){
            pw.println("YES");
           pw.println(moves.size());
            for (String s : moves) {
                pw.println(s);
            }
        }
         else{
              pw.println("NO");
         }

        pw.close();
    }
}
