import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] board = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            board[i] = Integer.parseInt(br.readLine());
        }

        int[] dice = new int[m];
        for (int i = 0; i < m; i++) {
            dice[i] = Integer.parseInt(br.readLine());
        }

        int pos = 1;
        int count = 0;

        for (int i = 0; i < m; i++) {
            count++;
            pos += dice[i];
            if (pos >= n) break;
            pos += board[pos];
            if (pos >= n) break;
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
