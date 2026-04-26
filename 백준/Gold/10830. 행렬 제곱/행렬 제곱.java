import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken()) % MOD;
            }
        }

        int[][] result = pow(matrix, b);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(result[i][j]);

                if (j < n - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    static int[][] pow(int[][] matrix, long exp) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = multiply(result, matrix);
            }

            matrix = multiply(matrix, matrix);
            exp /= 2;
        }

        return result;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }

                result[i][j] %= MOD;
            }
        }

        return result;
    }
}