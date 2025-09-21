import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int m = Integer.parseInt(br.readLine()); 
            String[] words = new String[m];
            for (int i = 0; i < m; i++) {
                words[i] = br.readLine();
            }

            int n = Integer.parseInt(br.readLine()); 
            sb.append("Scenario #").append(tc).append(":\n");
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken()); 
                StringBuilder password = new StringBuilder();
                for (int j = 0; j < k; j++) {
                    int idx = Integer.parseInt(st.nextToken());
                    password.append(words[idx]);
                }
                sb.append(password).append("\n");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
