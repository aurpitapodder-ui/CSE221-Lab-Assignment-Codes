import java.io.*;
import java.util.*;
public class Task06_AlternateSolve {
    public static void main(String[]args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int []dx = {-1,-1,-1,0,0,1,1,1};
    int []dy = {-1,0,1,-1,1,-1,0,1};
    ArrayList<int[]> moves = new ArrayList<>();
    int count =0;
    for (int i = 0; i < 8; i++) {
        int pos1 = x + dx[i];
        int pos2 = y + dy[i];
        if(pos1>=1 && pos1<=N && pos2>=1 && pos2<=N){
            moves.add(new int[]{pos1,pos2});
            count++;
        }
        
    }
    pw.println(count);
    for (int[] i: moves) {
        pw.println(i[0]+" "+i[1]);
    
    }
    pw.flush();
    }
}
