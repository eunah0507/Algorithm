import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int r = 0; r < k; r++) {
                for (int j = 0; j < n; j++) {
                    for (int c = 0; c < k; c++) {
                        sb.append(a[i][j]);
                        if (j != n - 1 || c != k - 1) {
                            sb.append(' ');
                        }
                    }
                }
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
