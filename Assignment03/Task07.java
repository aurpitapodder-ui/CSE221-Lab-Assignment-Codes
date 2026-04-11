import java.io.*;
import java.util.*;
public class Task07 {
    static int []preorder;
    static int []inorder;
    static int n;
    static int idx;
    static void post(int st, int end){
        if(st > end ) return;
        int root = preorder[idx++];
        int position = st;
        for (int i = position; i <= end; i++) {
            if(inorder[i] == root){
                position = i;
                break;
            }
            
        }
        post(st, position-1);
        post(position+1, end);
        System.out.print(root+ " ");
    }
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    n = Integer.parseInt(br.readLine());
    inorder = new int[n];
    preorder = new int [n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int index = 0; index < n; index++) {
        inorder[index] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int index = 0; index < n; index++) {
        preorder[index] = Integer.parseInt(st.nextToken());
        
    }
    post(0,n-1);

    }
}
