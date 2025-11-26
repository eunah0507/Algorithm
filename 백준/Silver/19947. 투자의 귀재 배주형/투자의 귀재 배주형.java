import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int startMoney = Integer.parseInt(st.nextToken()); 
        int year = Integer.parseInt(st.nextToken());      

        int[] dp = new int[year + 1];
        dp[0] = startMoney;

        for (int i = 1; i <= year; i++) {
            dp[i] = (int)(dp[i - 1] * 1.05);

            if (i >= 3) {
                dp[i] = Math.max(dp[i], (int)(dp[i - 3] * 1.20));
            }

            if (i >= 5) {
                dp[i] = Math.max(dp[i], (int)(dp[i - 5] * 1.35));
            }
        }

        sb.append(dp[year]);
        System.out.print(sb.toString());
    }
}
