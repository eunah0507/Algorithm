import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            pq.add(0L);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            long t = Long.parseLong(st.nextToken());
            long cur = pq.poll();
            pq.add(cur + t);
        }

        long minWait = pq.peek();
        if (minWait <= k) {
            sb.append("WAIT");
        } else {
            sb.append("GO");
        }

        System.out.print(sb.toString());
    }
}