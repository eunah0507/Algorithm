import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int count;
    static boolean[] col;
    static boolean[] left;
    static boolean[] right;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        col = new boolean[n];
        left = new boolean[n * 2];
        right = new boolean[n * 2];

        dfs(0);

        sb.append(count);

        System.out.print(sb.toString());
    }

    static void dfs(int row) {
        if (row == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!col[i] && !left[row + i] && !right[row - i + n]) {
                col[i] = true;
                left[row + i] = true;
                right[row - i + n] = true;

                dfs(row + 1);

                col[i] = false;
                left[row + i] = false;
                right[row - i + n] = false;
            }
        }
    }
}