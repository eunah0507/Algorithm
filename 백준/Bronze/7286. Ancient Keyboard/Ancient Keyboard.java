import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] cnt = new int[1001];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                for (int j = a; j < b; j++) {
                    cnt[j]++;
                }
            }

            for (int i = 0; i <= 1000; i++) {
                if (cnt[i] > 0) {
                    sb.append((char) ('A' + cnt[i] - 1));
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}