import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        int N = line == null ? 0 : Integer.valueOf(line);
        int dasom = Integer.valueOf(br.readLine());

        if (N == 1) {
            System.out.println(0);
            return;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < N; i++) {
            pq.add(Integer.valueOf(br.readLine()));
        }

        int bribe = 0;
        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int top = pq.poll();
            top--;
            dasom++;
            bribe++;
            pq.add(top);
        }

        sb.append(bribe);
        System.out.println(sb.toString());
    }
}
