import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int caseNum = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            ArrayList<Integer>[] graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph[a].add(b);
                graph[b].add(a);
            }

            boolean[] visited = new boolean[n + 1];
            int treeCount = 0;

            for (int i = 1; i <= n; i++) {
                if (visited[i]) {
                    continue;
                }

                int nodeCount = 0;
                int edgeCount = 0;
                ArrayDeque<Integer> queue = new ArrayDeque<>();

                queue.offer(i);
                visited[i] = true;

                while (!queue.isEmpty()) {
                    int now = queue.poll();
                    nodeCount++;
                    edgeCount += graph[now].size();

                    for (int next : graph[now]) {
                        if (!visited[next]) {
                            visited[next] = true;
                            queue.offer(next);
                        }
                    }
                }

                edgeCount /= 2;

                if (edgeCount == nodeCount - 1) {
                    treeCount++;
                }
            }

            sb.append("Case ").append(caseNum).append(": ");
            if (treeCount == 0) {
                sb.append("No trees.");
            } else if (treeCount == 1) {
                sb.append("There is one tree.");
            } else {
                sb.append("A forest of ").append(treeCount).append(" trees.");
            }
            sb.append('\n');

            caseNum++;
        }

        System.out.print(sb.toString());
    }
}