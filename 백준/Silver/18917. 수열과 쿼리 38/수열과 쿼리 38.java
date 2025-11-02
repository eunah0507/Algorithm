import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        Map<Integer, Deque<Integer>> pos = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(0);

        long sum = 0;
        int xor = 0;
        pos.computeIfAbsent(0, k -> new ArrayDeque<>()).addLast(0);

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int x = Integer.parseInt(st.nextToken());
                arr.add(x);
                pos.computeIfAbsent(x, k -> new ArrayDeque<>()).addLast(arr.size() - 1);
                sum += x;
                xor ^= x;

            } else if (type == 2) {
                int x = Integer.parseInt(st.nextToken());
                int idx = pos.get(x).pollFirst();
                sum -= x;
                xor ^= x;

            } else if (type == 3) {
                sb.append(sum).append('\n');

            } else {
                sb.append(xor).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}