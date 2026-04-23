import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n >= k) {
            sb.append(n - k);
            System.out.print(sb.toString());
            return;
        }

        int max = 100000;
        int[] dist = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        dist[n] = 0;
        deque.add(n);

        while (!deque.isEmpty()) {
            int cur = deque.pollFirst();

            if (cur == k) {
                break;
            }

            int next = cur * 2;
            if (next <= max && dist[next] > dist[cur]) {
                dist[next] = dist[cur];
                deque.addFirst(next);
            }

            next = cur - 1;
            if (next >= 0 && dist[next] > dist[cur] + 1) {
                dist[next] = dist[cur] + 1;
                deque.addLast(next);
            }

            next = cur + 1;
            if (next <= max && dist[next] > dist[cur] + 1) {
                dist[next] = dist[cur] + 1;
                deque.addLast(next);
            }
        }

        sb.append(dist[k]);
        System.out.print(sb.toString());
    }
}