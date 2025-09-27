import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] pos = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            pos[i] = Integer.parseInt(st.nextToken());
        }

        int maxGap = 0;
        for (int i = 1; i < M; i++) {
            maxGap = Math.max(maxGap, pos[i] - pos[i - 1]);
        }

        int left = pos[0];          
        int right = N - pos[M - 1];  
        int middle = (maxGap + 1) / 2; 

        int answer = Math.max(left, Math.max(right, middle));

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
