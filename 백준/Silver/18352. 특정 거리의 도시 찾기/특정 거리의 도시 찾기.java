import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] head = new int[n + 1];
        Arrays.fill(head, -1);

        int[] to = new int[m];
        int[] next = new int[m];
        int idx = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            to[idx] = b;
            next[idx] = head[a];
            head[a] = idx;
            idx++;
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);

        int[] q = new int[n];
        int front = 0;
        int back = 0;

        dist[x] = 0;
        q[back++] = x;

        while (front < back) {
            int cur = q[front++];

            if (dist[cur] == k) {
                continue;
            }

            for (int e = head[cur]; e != -1; e = next[e]) {
                int v = to[e];
                if (dist[v] != -1) {
                    continue;
                }
                dist[v] = dist[cur] + 1;
                q[back++] = v;
            }
        }

        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == k) {
                sb.append(i).append('\n');
                found = true;
            }
        }

        if (!found) {
            sb.append("-1\n");
        }

        System.out.print(sb);
    }
}