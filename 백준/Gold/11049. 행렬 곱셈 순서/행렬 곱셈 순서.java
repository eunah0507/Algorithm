import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] row = new int[n + 1];
        int[] col = new int[n + 1];
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            row[i] = Integer.parseInt(st.nextToken());
            col[i] = Integer.parseInt(st.nextToken());
        }

        for (int len = 2; len <= n; len++) {
            for (int start = 1; start + len - 1 <= n; start++) {
                int end = start + len - 1;
                dp[start][end] = Integer.MAX_VALUE;

                for (int mid = start; mid < end; mid++) {
                    dp[start][end] = Math.min(
                            dp[start][end],
                            dp[start][mid] + dp[mid + 1][end] + row[start] * col[mid] * col[end]
                    );
                }
            }
        }

        sb.append(dp[1][n]);
        System.out.print(sb.toString());
    }
}