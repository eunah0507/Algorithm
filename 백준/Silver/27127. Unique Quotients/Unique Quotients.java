import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int target = Integer.parseInt(br.readLine().trim());
        int cnt = 0;

        for (int d = 0; d <= 11111; d++) {
            int n = d * 9;
            if (n < 10000) {
                continue; 
            }

            boolean[] used = new boolean[10];
            int dd = d;
            boolean ok = true;

            for (int i = 0; i < 5; i++) {
                int digit = dd % 10;
                if (used[digit]) {
                    ok = false;
                    break;
                }
                used[digit] = true;
                dd /= 10;
            }
            if (!ok) {
                continue;
            }

            int nn = n;
            for (int i = 0; i < 5; i++) {
                int digit = nn % 10;
                if (used[digit]) {
                    ok = false;
                    break;
                }
                used[digit] = true;
                nn /= 10;
            }
            if (!ok) {
                continue;
            }

            cnt++;
            if (cnt == target) {
                sb.append(n).append(' ').append(String.format("%05d", d));
                System.out.print(sb.toString());
                return;
            }
        }
    }
}