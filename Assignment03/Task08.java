import java.io.*;
import java.util.*;
public class Task08 {
    static int []postorder;
    static int []inorder;
    static int n;
    static int idx;
    static int preIdx;
    static int [] preorder;
    static void pre(int st, int end){
        if(st > end || preIdx >= n ) return;
        int root = postorder[idx--];
        
        int position = -1;
        for (int i = st; i <= end; i++) {
            if(inorder[i] == root){
                position = i;
                break;
            }
            
        }  
       
        pre(position+1, end);   
        pre(st, position-1); 
        preorder[preIdx++] = root;
    }
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    n = Integer.parseInt(br.readLine());
    inorder = new int[n];
    postorder = new int [n];
    preorder = new int [n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int index = 0; index < n; index++) {
        inorder[index] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int index = 0; index < n; index++) {
        postorder[index] = Integer.parseInt(st.nextToken());
        
    }
    idx = n-1;
    pre(0,n-1);
    for (int index = n-1; index>=0; index--) {
        pw.print(preorder[index]+" ");
    }
      pw.flush();
    }
}
