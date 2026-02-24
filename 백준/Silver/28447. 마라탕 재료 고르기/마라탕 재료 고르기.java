import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static int[][] c;
    static int[] sel;
    static long max;

    static void dfs(int depth, int start, long cur) {
        if (depth == k) {
            if (cur > max) {
                max = cur;
            }
            return;
        }

        for (int i = start; i < n; i++) {
            long add = 0;
            for (int t = 0; t < depth; t++) {
                add += c[i][sel[t]];
            }
            sel[depth] = i;
            dfs(depth + 1, i + 1, cur + add);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        c = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                c[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sel = new int[k];
        max = Long.MIN_VALUE;
        dfs(0, 0, 0);

        sb.append(max);
        System.out.print(sb.toString());
    }
}