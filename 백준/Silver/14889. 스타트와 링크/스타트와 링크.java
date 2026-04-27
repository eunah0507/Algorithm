import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int answer = Integer.MAX_VALUE;
    static int[][] map;
    static boolean[] selected;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        selected = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        sb.append(answer);
        System.out.print(sb.toString());
    }

    static void dfs(int depth, int start) {
        if (depth == n / 2) {
            int startSum = 0;
            int linkSum = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (selected[i] && selected[j]) {
                        startSum += map[i][j] + map[j][i];
                    } else if (!selected[i] && !selected[j]) {
                        linkSum += map[i][j] + map[j][i];
                    }
                }
            }

            answer = Math.min(answer, Math.abs(startSum - linkSum));
            return;
        }

        for (int i = start; i < n; i++) {
            selected[i] = true;
            dfs(depth + 1, i + 1);
            selected[i] = false;
        }
    }
}