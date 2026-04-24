import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];
            int[] sum = new int[n + 1];
            int[][] dp = new int[n + 1][n + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum[i] = sum[i - 1] + arr[i];
                dp[i][i] = arr[i];
            }

            for (int len = 2; len <= n; len++) {
                for (int start = 1; start + len - 1 <= n; start++) {
                    int end = start + len - 1;
                    int total = sum[end] - sum[start - 1];

                    dp[start][end] = Math.max(
                            arr[start] + total - arr[start] - dp[start + 1][end],
                            arr[end] + total - arr[end] - dp[start][end - 1]
                    );
                }
            }

            sb.append(dp[1][n]).append('\n');
        }

        System.out.print(sb.toString());
    }
}