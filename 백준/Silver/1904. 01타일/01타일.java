import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MOD = 15746;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine().trim());

        if (num == 1) {
            sb.append(1);
            System.out.print(sb.toString());
            return;
        }

        int[] dp = new int[num + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= num; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        int answer = dp[num];
        
        sb.append(answer);
        System.out.print(sb.toString());
    }
}
