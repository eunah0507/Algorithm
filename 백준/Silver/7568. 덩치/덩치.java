import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] w = new int[n];
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            h[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (w[j] > w[i] && h[j] > h[i]) {
                    rank++;
                }
            }
            sb.append(rank);
            if (i + 1 < n) {
                sb.append(' ');
            }
        }

        System.out.println(sb.toString());
    }
}
