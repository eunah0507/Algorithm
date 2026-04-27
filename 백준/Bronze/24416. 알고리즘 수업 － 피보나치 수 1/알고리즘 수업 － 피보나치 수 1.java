import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] dp = new int[41];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        sb.append(dp[n]).append(" ").append(n - 2);

        System.out.print(sb.toString());
    }
}