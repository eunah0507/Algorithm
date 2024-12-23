import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 누적합 계산
        long[] prefixSum = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        // 다이어트를 시작할 가장 늦은 날짜 찾기
        int result = -1;
        for (int i = 1; i <= N; i++) {
            if (prefixSum[N] - prefixSum[i - 1] >= M) {
                result = i;
            }
        }

        sb.append(result).append("\n");
        System.out.print(sb.toString());
    }
}
