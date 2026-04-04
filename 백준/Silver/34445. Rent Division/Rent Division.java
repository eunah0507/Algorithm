import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] c = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(br.readLine());
            sum += c[i];
        }

        long r = Long.parseLong(br.readLine());
        long target = (sum + r + n - 1L) / n;

        for (int i = 0; i < n; i++) {
            if (c[i] > target) {
                System.out.print("not possible");
                return;
            }
            sb.append(target - c[i]).append('\n');
        }

        System.out.print(sb.toString());
    }
}