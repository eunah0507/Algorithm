import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] paper;
    static int[] count = new int[2];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cut(0, 0, n);

        sb.append(count[0]).append("\n");
        sb.append(count[1]);

        System.out.print(sb.toString());
    }

    static void cut(int row, int col, int size) {
        if (isSame(row, col, size)) {
            count[paper[row][col]]++;
            return;
        }

        int nextSize = size / 2;

        cut(row, col, nextSize);
        cut(row, col + nextSize, nextSize);
        cut(row + nextSize, col, nextSize);
        cut(row + nextSize, col + nextSize, nextSize);
    }

    static boolean isSame(int row, int col, int size) {
        int value = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != value) {
                    return false;
                }
            }
        }

        return true;
    }
}