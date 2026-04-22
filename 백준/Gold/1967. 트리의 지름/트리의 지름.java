import java.io.BufferedReader;
import java.io.InputStreamReader;
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

    static int n;
    static ArrayList<Edge>[] graph;
    static int max;

    static int dfs(int now) {
        int first = 0;
        int second = 0;

        for (Edge next : graph[now]) {
            int dist = dfs(next.to) + next.cost;

            if (dist > first) {
                second = first;
                first = dist;
            } else if (dist > second) {
                second = dist;
            }
        }

        max = Math.max(max, first + second);
        return first;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph[parent].add(new Edge(child, cost));
        }

        dfs(1);

        sb.append(max);
        System.out.print(sb.toString());
    }
}