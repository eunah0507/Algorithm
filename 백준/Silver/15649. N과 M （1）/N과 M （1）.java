import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int n, m;
    static int[] arr;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                used[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbInput = new StringBuilder(br.readLine());
        String[] tmp = sbInput.toString().split(" ");

        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);

        arr = new int[m];
        used = new boolean[n + 1];

        dfs(0);

        System.out.print(sb.toString());
    }
}
