import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());      
        int target = Integer.parseInt(st.nextToken());  

        int[] need = new int[num];   

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            need[i] = Math.max(0, B - A);
        }

        Arrays.sort(need);
        int answer = need[target - 1];

        sb.append(answer);
        System.out.print(sb.toString());
    }
}
