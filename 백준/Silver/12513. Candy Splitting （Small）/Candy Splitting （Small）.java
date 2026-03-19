import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int xor = 0;
            int min = Integer.MAX_VALUE;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                xor ^= x;
                sum += x;
                if (x < min) {
                    min = x;
                }
            }

            sb.append("Case #").append(tc).append(": ");
            if (xor != 0) {
                sb.append("NO");
            } else {
                sb.append(sum - min);
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}