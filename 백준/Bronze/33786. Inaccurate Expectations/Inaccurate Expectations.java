import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ZERO;

        for (int i = 1; i <= n; i++) {
            dp[i] = BigInteger.valueOf(i).add(BigInteger.valueOf(i).multiply(dp[i - 1]));
        }

        sb.append(dp[n].toString());
        System.out.println(sb.toString());
    }
}
