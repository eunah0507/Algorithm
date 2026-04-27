import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (i == 1) {
                dp[i][0] = r;
                dp[i][1] = g;
                dp[i][2] = b;
            } else {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r;
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g;
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b;
            }
        }

        int result = Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));
        sb.append(result);

        System.out.print(sb.toString());
    }
}