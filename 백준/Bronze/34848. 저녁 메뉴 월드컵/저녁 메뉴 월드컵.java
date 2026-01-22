import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        for (int tc = 0; tc < t; tc++) {
            long n = Long.parseLong(br.readLine().trim());
            long ans = 0;

            while (n > 1) {
                if ((n & 1L) == 1L) {
                    ans++;
                }
                n = (n + 1) / 2;
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }
}
