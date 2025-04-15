import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		if (n == 1 || n == 2) {
			sb.append(1);
		} else {
			BigInteger[] dp = new BigInteger[n + 1];
			dp[1] = BigInteger.ONE;
			dp[2] = BigInteger.ONE;

			for (int i = 3; i <= n; i++) {
				dp[i] = dp[i - 1].add(dp[i - 2]);
			}

			sb.append(dp[n]);
		}

		System.out.println(sb.toString());
	}
}
