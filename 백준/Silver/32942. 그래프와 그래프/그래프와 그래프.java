import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        boolean[][] edge = new boolean[11][11];

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (a * x + b * y == c) {
                    edge[x][y] = true;
                }
            }
        }

        for (int i = 1; i <= 10; i++) {
            boolean first = true;
            for (int j = 1; j <= 10; j++) {
                if (edge[i][j]) {
                    if (!first) {
                        sb.append(' ');
                    }
                    sb.append(j);
                    first = false;
                }
            }
            if (first) {
                sb.append('0');
            }
            if (i < 10) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}