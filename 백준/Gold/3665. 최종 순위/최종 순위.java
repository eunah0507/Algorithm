import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] lastYear = new int[n];
            int[] indegree = new int[n + 1];
            boolean[][] graph = new boolean[n + 1][n + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                lastYear[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int higher = lastYear[i];
                    int lower = lastYear[j];
                    graph[higher][lower] = true;
                    indegree[lower]++;
                }
            }

            int m = Integer.parseInt(br.readLine());

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (graph[a][b]) {
                    graph[a][b] = false;
                    graph[b][a] = true;
                    indegree[b]--;
                    indegree[a]++;
                } else {
                    graph[b][a] = false;
                    graph[a][b] = true;
                    indegree[a]--;
                    indegree[b]++;
                }
            }

            ArrayDeque<Integer> queue = new ArrayDeque<>();
            for (int i = 1; i <= n; i++) {
                if (indegree[i] == 0) {
                    queue.offer(i);
                }
            }

            int[] result = new int[n];
            boolean impossible = false;
            boolean ambiguous = false;

            for (int i = 0; i < n; i++) {
                if (queue.isEmpty()) {
                    impossible = true;
                    break;
                }

                if (queue.size() > 1) {
                    ambiguous = true;
                    break;
                }

                int cur = queue.poll();
                result[i] = cur;

                for (int next = 1; next <= n; next++) {
                    if (graph[cur][next]) {
                        indegree[next]--;
                        if (indegree[next] == 0) {
                            queue.offer(next);
                        }
                    }
                }
            }

            if (impossible) {
                sb.append("IMPOSSIBLE").append('\n');
            } else if (ambiguous) {
                sb.append("?").append('\n');
            } else {
                for (int i = 0; i < n; i++) {
                    sb.append(result[i]).append(' ');
                }
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}