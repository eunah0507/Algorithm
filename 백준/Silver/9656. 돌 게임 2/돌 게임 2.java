import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // StringBuilder 대소문자 수정
        
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-3]) + 1;
        }
        
        if (dp[n] % 2 == 0) {
            sb.append("SK").append("\n");
        } else {
            sb.append("CY").append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
