import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean[] generated = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = i;
            int sum = n;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum <= 10000) {
                generated[sum] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!generated[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb.toString());
    }
}
