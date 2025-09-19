import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] aliens = new int[n + 1];
        int totalShots = 0;

        for (int i = 1; i <= n; i++) {
            aliens[i] = Integer.parseInt(st.nextToken());
            totalShots += aliens[i];
        }

        int L = -1, R = -1;
        for (int i = 1; i <= n; i++) {
            if (aliens[i] > 0) {
                if (L == -1) L = i;
                R = i;
            }
        }

        int moveLeftFirst = Math.abs(p - L) + (R - L);
        int moveRightFirst = Math.abs(R - p) + (R - L);

        int answer = totalShots + Math.min(moveLeftFirst, moveRightFirst);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}