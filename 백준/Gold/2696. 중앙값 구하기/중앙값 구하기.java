import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int m = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> right = new PriorityQueue<>();

            sb.append((m + 1) / 2).append('\n');

            int count = 0;
            int outputCount = 0;
            StringTokenizer st = null;

            for (int i = 0; i < m; i++) {
                if (i % 10 == 0) {
                    st = new StringTokenizer(br.readLine());
                }

                int num = Integer.parseInt(st.nextToken());

                if (left.size() == right.size()) {
                    left.offer(num);
                } else {
                    right.offer(num);
                }

                if (!right.isEmpty() && left.peek() > right.peek()) {
                    int a = left.poll();
                    int b = right.poll();

                    left.offer(b);
                    right.offer(a);
                }

                if (i % 2 == 0) {
                    sb.append(left.peek()).append(" ");
                    count++;
                    outputCount++;

                    if (count == 10) {
                        sb.append('\n');
                        count = 0;
                    }
                }
            }

            if (count != 0) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}