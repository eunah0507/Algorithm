import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());   
        int numA = Integer.parseInt(st.nextToken());  

        int[][] medal = new int[num + 1][3]; 
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int nation = Integer.parseInt(st.nextToken());
            medal[nation][0] = Integer.parseInt(st.nextToken()); 
            medal[nation][1] = Integer.parseInt(st.nextToken()); 
            medal[nation][2] = Integer.parseInt(st.nextToken()); 
        }

        int answer = 1; 
        for (int i = 1; i <= num; i++) {
            if (i == numA) continue; 
            if (medal[i][0] > medal[numA][0]) answer++;
            else if (medal[i][0] == medal[numA][0] && medal[i][1] > medal[numA][1]) answer++;
            else if (medal[i][0] == medal[numA][0] && medal[i][1] == medal[numA][1] && medal[i][2] > medal[numA][2]) answer++;
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}
