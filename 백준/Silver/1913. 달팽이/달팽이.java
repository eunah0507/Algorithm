import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        int r = n / 2;
        int c = n / 2;
        int num = 1;
        arr[r][c] = num;

        int ansR = r + 1;
        int ansC = c + 1;

        if (target == 1) {
            ansR = r + 1;
            ansC = c + 1;
        }

        int len = 1;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (num < n * n) {
            for (int d = 0; d < 4; d++) {
                int move = len;
                if (d == 0 || d == 2) {
                    move = len;
                } else {
                    move = len;
                    len++;
                }

                for (int i = 0; i < move; i++) {
                    r += dr[d];
                    c += dc[d];
                    num++;
                    arr[r][c] = num;

                    if (num == target) {
                        ansR = r + 1;
                        ansC = c + 1;
                    }

                    if (num == n * n) {
                        break;
                    }
                }

                if (num == n * n) {
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
                if (j < n - 1) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }

        sb.append(ansR).append(' ').append(ansC);
        System.out.print(sb);
    }
}