import java.io.*;
import java.util.*;

public class Solution {
    static class Student {
    int id;
    int mark;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t>0){
            int N = Integer.parseInt(br.readLine());
            Student [] students = new Student [N];
            String idS= br.readLine();
            String m = br.readLine();
            String [] part1 = m.split(" ");
             String [] part2 = idS.split(" ");

             for (int i = 0; i < N; i++) {
              students[i] = new Student();
                students[i].mark = Integer.parseInt(part1[i]);
                
             }


            for (int j = 0; j < N; j++) {
                students[j].id = Integer.parseInt(part2[j]);
                
            }
            int count =0;
            for (int i = 0; i < N; i++) {
                int maxIndex = i;
                for (int j = i+1; j < N; j++) {
                    if(students[j].mark > students[maxIndex].mark) {
                        maxIndex = j;
                    }
                    else if ((students[j].mark == students[maxIndex].mark) && (students[j].id < students[maxIndex].id)) {
                        maxIndex = j;
                        
                    }
                    
                }
                if(maxIndex!=i){
                    Student temp = students[i];
                    students[i] = students[maxIndex];
                    students[maxIndex] = temp;
                    count++;
                }
                
            }
                pw.println("Minimum swaps: " + count);
                for (int i = 0; i < N; i++) {
                    pw.println("ID: " + students[i].id + " Mark: " + students[i].mark);
                }

            t--;
        }

        pw.close();
      
    }
}
