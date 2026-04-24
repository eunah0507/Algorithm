import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] weights;
    static boolean[][] visited;
    static boolean[] possible;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        weights = new int[n];
        visited = new boolean[n + 1][15001];
        possible = new boolean[15001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int marble = Integer.parseInt(st.nextToken());

            if (marble <= 15000 && possible[marble]) {
                sb.append("Y");
            } else {
                sb.append("N");
            }

            if (i < m - 1) {
                sb.append(' ');
            }
        }

        System.out.print(sb.toString());
    }

    static void dfs(int idx, int diff) {
        if (visited[idx][diff]) {
            return;
        }

        visited[idx][diff] = true;
        possible[diff] = true;

        if (idx == n) {
            return;
        }

        dfs(idx + 1, diff);
        dfs(idx + 1, diff + weights[idx]);
        dfs(idx + 1, Math.abs(diff - weights[idx]));
    }
}