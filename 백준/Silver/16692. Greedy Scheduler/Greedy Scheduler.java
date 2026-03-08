import java.io.*;
import java.util.*;

public class Main {

    static class Cashier implements Comparable<Cashier> {
        int num;
        int endTime;

        Cashier(int num, int endTime) {
            this.num = num;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Cashier o) {
            if (this.endTime != o.endTime) {
                return this.endTime - o.endTime;
            }
            return this.num - o.num;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] t = new int[c];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[c];
        PriorityQueue<Cashier> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            ans[i] = i + 1;
            pq.offer(new Cashier(i + 1, t[i]));
        }

        for (int i = n; i < c; i++) {
            Cashier cur = pq.poll();
            ans[i] = cur.num;
            pq.offer(new Cashier(cur.num, cur.endTime + t[i]));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c; i++) {
            sb.append(ans[i]);
            if (i < c - 1) sb.append(' ');
        }

        System.out.println(sb.toString());
    }
}