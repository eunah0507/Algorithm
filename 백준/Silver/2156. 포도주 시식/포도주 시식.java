import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        int[] wine = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        // n이 1, 2일 때는 바로 처리
        if (n == 1) {
            sb.append(wine[1]);
            System.out.println(sb);
            return;
        }
        if (n == 2) {
            sb.append(wine[1] + wine[2]);
            System.out.println(sb);
            return;
        }

        int[] dp = new int[n + 1];
        dp[1] = wine[1];
        dp[2] = wine[1] + wine[2];

        for (int i = 3; i <= n; i++) {
            int case1 = dp[i - 1];                     
            int case2 = dp[i - 2] + wine[i];           
            int case3 = dp[i - 3] + wine[i - 1] + wine[i];  
            dp[i] = Math.max(case1, Math.max(case2, case3));
        }

        sb.append(dp[n]);
        System.out.println(sb);
    }
}
