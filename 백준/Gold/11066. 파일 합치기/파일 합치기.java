import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int k = Integer.parseInt(br.readLine());
            int[] sum = new int[k + 1];
            int[][] dp = new int[k + 1][k + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= k; i++) {
                sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
            }

            for (int len = 2; len <= k; len++) {
                for (int start = 1; start + len - 1 <= k; start++) {
                    int end = start + len - 1;
                    dp[start][end] = Integer.MAX_VALUE;

                    for (int mid = start; mid < end; mid++) {
                        dp[start][end] = Math.min(
                                dp[start][end],
                                dp[start][mid] + dp[mid + 1][end] + sum[end] - sum[start - 1]
                        );
                    }
                }
            }

            sb.append(dp[1][k]).append('\n');
        }

        System.out.print(sb.toString());
    }
}