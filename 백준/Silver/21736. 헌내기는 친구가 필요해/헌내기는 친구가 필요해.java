import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][m];
        boolean[][] visited = new boolean[n][m];

        int startR = -1;
        int startC = -1;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                char c = line.charAt(j);
                map[i][j] = c;
                if (c == 'I') {
                    startR = i;
                    startC = j;
                }
            }
        }

        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {startR, startC});
        visited[startR][startC] = true;

        int count = 0;
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            if (map[r][c] == 'P') {
                count++;
            }

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (map[nr][nc] == 'X') {
                    continue;
                }

                visited[nr][nc] = true;
                q.offer(new int[] {nr, nc});
            }
        }

        if (count == 0) {
            sb.append("TT");
        } else {
            sb.append(count);
        }

        System.out.print(sb.toString());
    }
}
