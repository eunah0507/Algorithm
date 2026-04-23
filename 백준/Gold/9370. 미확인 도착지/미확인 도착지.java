import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        int idx;
        long dist;

        Node(int idx, long dist) {
            this.idx = idx;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other) {
            return Long.compare(this.dist, other.dist);
        }
    }

    static ArrayList<Edge>[] graph;
    static final long INF = Long.MAX_VALUE / 4;

    static long[] dijkstra(int start, int n) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, INF);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.dist > dist[cur.idx]) {
                continue;
            }

            for (Edge next : graph[cur.idx]) {
                long nextDist = cur.dist + next.cost;
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

        int tCase = Integer.parseInt(br.readLine());

        while (tCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            int ghCost = 0;

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());

                graph[a].add(new Edge(b, d));
                graph[b].add(new Edge(a, d));

                if ((a == g && b == h) || (a == h && b == g)) {
                    ghCost = d;
                }
            }

            ArrayList<Integer> candidates = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                candidates.add(Integer.parseInt(br.readLine()));
            }
            Collections.sort(candidates);

            long[] distS = dijkstra(s, n);
            long[] distG = dijkstra(g, n);
            long[] distH = dijkstra(h, n);

            for (int target : candidates) {
                long shortest = distS[target];
                long path1 = distS[g] + ghCost + distH[target];
                long path2 = distS[h] + ghCost + distG[target];

                if (shortest == path1 || shortest == path2) {
                    sb.append(target).append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}