import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static class Edge {
        int to;
        int cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static int v;
    static ArrayList<Edge>[] graph;

    static int[] bfs(int start) {
        int[] dist = new int[v + 1];
        boolean[] visited = new boolean[v + 1];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (Edge next : graph[now]) {
                if (!visited[next.to]) {
                    visited[next.to] = true;
                    dist[next.to] = dist[now] + next.cost;
                    queue.offer(next.to);
                }
            }
        }

        int maxNode = start;
        for (int i = 1; i <= v; i++) {
            if (dist[i] > dist[maxNode]) {
                maxNode = i;
            }
        }

        return new int[]{maxNode, dist[maxNode]};
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        v = Integer.parseInt(br.readLine());
        graph = new ArrayList[v + 1];

        for (int i = 1; i <= v; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < v; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());

            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) {
                    break;
                }

                int cost = Integer.parseInt(st.nextToken());
                graph[from].add(new Edge(to, cost));
            }
        }

        int[] first = bfs(1);
        int[] second = bfs(first[0]);

        sb.append(second[1]);
        System.out.print(sb.toString());
    }
}