import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] board = new int[9][9];
    static boolean[][] row = new boolean[9][10];
    static boolean[][] col = new boolean[9][10];
    static boolean[][] box = new boolean[9][10];
    static boolean finished;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());

                if (board[i][j] != 0) {
                    row[i][board[i][j]] = true;
                    col[j][board[i][j]] = true;
                    box[(i / 3) * 3 + j / 3][board[i][j]] = true;
                }
            }
        }

        dfs(0);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(board[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }

    static void dfs(int depth) {
        if (finished) {
            return;
        }

        if (depth == 81) {
            finished = true;
            return;
        }

        int r = depth / 9;
        int c = depth % 9;
        int b = (r / 3) * 3 + c / 3;

        if (board[r][c] != 0) {
            dfs(depth + 1);
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (!row[r][i] && !col[c][i] && !box[b][i]) {
                board[r][c] = i;
                row[r][i] = true;
                col[c][i] = true;
                box[b][i] = true;

                dfs(depth + 1);

                if (finished) {
                    return;
                }

                board[r][c] = 0;
                row[r][i] = false;
                col[c][i] = false;
                box[b][i] = false;
            }
        }
    }
}