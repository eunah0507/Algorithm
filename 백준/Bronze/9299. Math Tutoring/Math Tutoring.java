import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());

            int[] coef = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                coef[i] = Integer.parseInt(st.nextToken());
            }

            sb.append("Case ").append(tc).append(": ");

            if (n == 0) {
                sb.append(0).append('\n');
                continue;
            }

            sb.append(n - 1);

            for (int i = 0; i < n; i++) {
                sb.append(" ").append(coef[i] * (n - i));
            }

            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
