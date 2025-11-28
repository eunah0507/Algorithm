import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] w = new int[n + 1];
        
        for (int i = 1; i <= n; i++) w[i] = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        
        if (n >= 1) dp[1] = w[1];
        if (n >= 2) dp[2] = w[1] + w[2];
        
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + w[i], dp[i - 3] + w[i - 1] + w[i]));
        }

        sb.append(dp[n]);
        System.out.println(sb.toString());
    }
}
