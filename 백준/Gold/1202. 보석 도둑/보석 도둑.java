import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] jewel = new int[n][2];
        int[] bag = new int[k];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            jewel[i][0] = Integer.parseInt(st.nextToken());
            jewel[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < k; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(jewel, (a, b) -> a[0] - b[0]);
        Arrays.sort(bag);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        long answer = 0;
        int index = 0;

        for (int i = 0; i < k; i++) {
            while (index < n && jewel[index][0] <= bag[i]) {
                pq.offer(jewel[index][1]);
                index++;
            }

            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }
}