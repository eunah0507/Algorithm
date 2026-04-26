import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static char[][] video;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        video = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                video[i][j] = line.charAt(j);
            }
        }

        compress(0, 0, n, sb);

        System.out.print(sb.toString());
    }

    static void compress(int row, int col, int size, StringBuilder sb) {
        if (isSame(row, col, size)) {
            sb.append(video[row][col]);
            return;
        }

        int nextSize = size / 2;

        sb.append("(");
        compress(row, col, nextSize, sb);
        compress(row, col + nextSize, nextSize, sb);
        compress(row + nextSize, col, nextSize, sb);
        compress(row + nextSize, col + nextSize, nextSize, sb);
        sb.append(")");
    }

    static boolean isSame(int row, int col, int size) {
        char value = video[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (video[i][j] != value) {
                    return false;
                }
            }
        }

        return true;
    }
}