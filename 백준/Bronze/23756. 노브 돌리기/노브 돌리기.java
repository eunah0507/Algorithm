import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        int cur = Integer.parseInt(br.readLine().trim());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int next = Integer.parseInt(br.readLine().trim());
            int diff = next - cur;
            diff %= 360;
            if (diff < 0) {
                diff += 360;
            }
            sum += Math.min(diff, 360 - diff);
            cur = next;
        }

        sb.append(sum);
        System.out.print(sb.toString());
    }
}
