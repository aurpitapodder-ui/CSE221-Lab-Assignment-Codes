import java.io.*;
import java.util.*;
public class Task06 {
public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    ArrayList<int[]> moves = new ArrayList<>();
    int count =0;

    if(x-1 >=1 && y-1>=1){
       moves.add(new int[]{x - 1, y - 1});
       count++;
    }

    if(x-1>=1){
        moves.add(new int[]{x-1,y});
        count++;
    }

    if(x-1>=1 && y+1<=N){
        moves.add(new int[]{x-1,y+1});
        count++;
    }

    if(y-1>=1){
        moves.add(new int[]{x,y-1});
        count++;
    }
     if(y+1<=N){
        moves.add(new int[]{x,y+1});
        count++;
    }
     if(x+1<=N && y-1>=1){
        moves.add(new int[]{x+1,y-1});
        count++;
    }
     if(x+1<=N){
        moves.add(new int[]{x+1,y});
        count++;
    }
    if(x+1<=N && y+1<=N){
        moves.add(new int[]{x+1,y+1});
        count++;
    }
    pw.println(count);
    for (int[] i : moves) {
        pw.println(i[0] + " " + i[1]);
    }
   pw.flush();

 }
}
