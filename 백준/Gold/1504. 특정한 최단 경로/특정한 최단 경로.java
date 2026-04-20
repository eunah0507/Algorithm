import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
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

    static class Node implements Comparable<Node> {
        int vertex;
        long dist;

        Node(int vertex, long dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other) {
            return Long.compare(this.dist, other.dist);
        }
    }

    static final long INF = Long.MAX_VALUE;
    static ArrayList<Edge>[] graph;
    static int n;

    static long[] dijkstra(int start) {
        long[] dist = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            dist[i] = INF;
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (current.dist > dist[current.vertex]) {
                continue;
            }

            for (Edge next : graph[current.vertex]) {
                long nextDist = current.dist + next.cost;

                if (nextDist < dist[next.to]) {
                    dist[next.to] = nextDist;
                    pq.offer(new Node(next.to, nextDist));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new Edge(b, c));
            graph[b].add(new Edge(a, c));
        }

        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        long[] distFrom1 = dijkstra(1);
        long[] distFromV1 = dijkstra(v1);
        long[] distFromV2 = dijkstra(v2);

        long path1 = INF;
        long path2 = INF;

        if (distFrom1[v1] != INF && distFromV1[v2] != INF && distFromV2[n] != INF) {
            path1 = distFrom1[v1] + distFromV1[v2] + distFromV2[n];
        }

        if (distFrom1[v2] != INF && distFromV2[v1] != INF && distFromV1[n] != INF) {
            path2 = distFrom1[v2] + distFromV2[v1] + distFromV1[n];
        }

        long answer = Math.min(path1, path2);

        if (answer == INF) {
            sb.append(-1);
        } else {
            sb.append(answer);
        }

        System.out.print(sb.toString());
    }
}