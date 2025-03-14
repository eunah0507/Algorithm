import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        long[] numbers = new long[n + 1];
        long[] prefixSum = new long[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            numbers[i] = Long.parseLong(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + numbers[i]; 
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                sb.append(prefixSum[b] - prefixSum[a - 1]).append("\n");

                long temp = numbers[a];
                numbers[a] = numbers[b];
                numbers[b] = temp;

                for (int j = 1; j <= n; j++) {
                    prefixSum[j] = prefixSum[j - 1] + numbers[j];
                }
            } else {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());

                long sumAB = prefixSum[b] - prefixSum[a - 1];
                long sumCD = prefixSum[d] - prefixSum[c - 1];

                sb.append(sumAB - sumCD).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
