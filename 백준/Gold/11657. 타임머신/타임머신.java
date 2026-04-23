import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static class Edge {
        int from;
        int to;
        int cost;

        Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Edge> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges.add(new Edge(from, to, cost));
        }

        long[] dist = new long[n + 1];
        long inf = Long.MAX_VALUE / 4;

        for (int i = 1; i <= n; i++) {
            dist[i] = inf;
        }
        dist[1] = 0;

        boolean updated = false;

        for (int i = 1; i <= n; i++) {
            updated = false;

            for (Edge edge : edges) {
                if (dist[edge.from] == inf) {
                    continue;
                }

                if (dist[edge.to] > dist[edge.from] + edge.cost) {
                    dist[edge.to] = dist[edge.from] + edge.cost;
                    updated = true;

                    if (i == n) {
                        System.out.print(-1);
                        return;
                    }
                }
            }

            if (!updated) {
                break;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (dist[i] == inf) {
                sb.append(-1).append('\n');
            } else {
                sb.append(dist[i]).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}