import java.io.*;
import java.util.*;

public class Main {
 static class Train {
    String Line;
    String name;
    int minutes;
    int index;

    Train(String line, int idx) {
        Line = line;
        index = idx;

        String[] parts = line.split(" ");
        name = parts[0];

        String time = parts[parts.length - 1];
        String[] HM = time.split(":");
        minutes = Integer.parseInt(HM[0]) * 60 + Integer.parseInt(HM[1]);
    }
}
    static int getOrder(char c) {
        if (c >= 'a' && c <= 'z')
            return c - 'a';
        else
            return 26 + (c - 'A');
    }

    static int compareNames(String a, String b) {
        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return getOrder(a.charAt(i)) - getOrder(b.charAt(i));
            }
        }

        return a.length() - b.length();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Train[] trains = new Train[n];

        for (int i = 0; i < n; i++) {
            trains[i] = new Train(br.readLine(), i);
        }

        Arrays.sort(trains, new Comparator<Train>() {

            public int compare(Train a, Train b) {

                int nameCompare = compareNames(a.name, b.name);
                if (nameCompare != 0)
                    return nameCompare;

                if (a.minutes != b.minutes)
                    return b.minutes - a.minutes;  

                return a.index - b.index; 
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(trains[i].Line);
        }
    }
}
