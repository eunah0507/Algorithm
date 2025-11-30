import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer newStringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(newStringTokenizer.nextToken());
        int m = Integer.parseInt(newStringTokenizer.nextToken());

        int[][] prefix = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            newStringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                int val = Integer.parseInt(newStringTokenizer.nextToken());
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + val;
            }
        }

        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int q = 0; q < k; q++) {
            newStringTokenizer = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(newStringTokenizer.nextToken());
            int j = Integer.parseInt(newStringTokenizer.nextToken());
            int x = Integer.parseInt(newStringTokenizer.nextToken());
            int y = Integer.parseInt(newStringTokenizer.nextToken());

            int sum = prefix[x][y] - prefix[i - 1][y] - prefix[x][j - 1] + prefix[i - 1][j - 1];
            sb.append(sum).append('\n');
        }

        System.out.print(sb.toString());
    }
}
